import { TaskService } from './../../service/task.service';

import { Component, OnInit } from '@angular/core';
import { Task } from '../task.model';

@Component({
  selector: 'tasks-list',
  templateUrl: './tasks-list.component.html',
  styleUrls: ['./tasks-list.component.css']
})
export class TasksListComponent implements OnInit {

  public tasks: Task[] = [];

  constructor(private ts: TaskService) { }

  ngOnInit() {
    this.ts.getAllTasks().subscribe(
      response => this.tasks = response,
      error => console.log(error));
   }

  onTaskChange(event, task){
    console.log("Value is shanged");
  }

  getDueDateLabel(task: Task){
    return task.checked ? 'badge-success' : 'badge-primary';
  }

}
