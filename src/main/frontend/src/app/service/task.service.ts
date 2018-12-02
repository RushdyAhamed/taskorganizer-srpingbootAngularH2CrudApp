import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable} from 'rxjs';
import { Task } from '../tasks/task.model';

@Injectable({
  providedIn: 'root'
})
export class TaskService {

  private url = "http://localhost:8080/api/tasks";

  constructor(private http: HttpClient) { }

  getAllTasks(){
    return this.http.get<Task[]>(this.url);
  }

}
