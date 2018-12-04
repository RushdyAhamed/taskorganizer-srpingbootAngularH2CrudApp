import { Component, OnInit } from '@angular/core';
import { Task } from '../task.model';
import { TaskService } from 'src/app/service/task.service';

@Component({
  selector: 'tasks-add',
  templateUrl: './tasks-add.component.html',
  styleUrls: ['./tasks-add.component.css']
})
export class TasksAddComponent implements OnInit {

  private inputValue = "";

  constructor(private ts: TaskService) { }

  ngOnInit() {
   
  }

  onAddTask(value){
    let name: string = value;
    let dueDate: string = this.getDateByString();
    //let num: number = this.ts.numOfTasks + 1;
    //let newTask = new Task(num, name, dueDate, false);
    let newTask = new Task(name, dueDate, false);

    this.ts.saveTask(newTask).subscribe(
      response => {
        this.inputValue = '';
        this.ts.taskEmiter.emit(newTask);
      }
    );
  }

  getDateByString(){
    let date = new Date();
    let dd: any = date.getDate();
    let mm: any = date.getMonth() + 1;
    let yyyy = date.getFullYear();
    
    if(dd < 10){
      dd = '0' + dd;
    }

    if(mm < 10){
      mm = '0' + mm;
    }

    return mm + '/' + dd + '/' + yyyy;
  }

}
