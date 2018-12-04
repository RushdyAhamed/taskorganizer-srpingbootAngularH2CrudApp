import { Injectable, EventEmitter } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { throwError } from 'rxjs';

import { Task } from '../tasks/task.model';


@Injectable({
  providedIn: 'root'
})
export class TaskService {

  private getUrl = "http://localhost:8080/api/tasks";
  private postUrl = "http://localhost:8080/api/tasks/save";
  private puttUrl = "http://localhost:8080/api/tasks/update";
  taskEmiter = new EventEmitter<Task>();
  //public numOfTasks = 9;

  constructor(private http: HttpClient) { }

  getAllTasks(){
    return this.http.get<Task[]>(this.getUrl);
  }

  saveTask(task: Task){
    //this.numOfTasks = this.numOfTasks + 1;
    return this.http.post<Task>(this.postUrl, task)
      .pipe(
      catchError(this.handleError)
    );
  }

  updateTask(task: Task, checked: boolean){
    task.checked = checked;
    return this.http.put<Task>(this.puttUrl, task)
      .pipe(
      catchError(this.handleError)
    );
  }

  handleError(error: any){
    return throwError(error || 'SERVER ERROR'); 
  }

}
