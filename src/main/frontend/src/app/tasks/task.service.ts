import {HttpClient} from '@angular/common/http';
import {Injectable} from "@angular/core";
import {Observable} from "rxjs";
import {Task} from "./task.model";


@Injectable()
export class TaskService{


    constructor(private http: HttpClient) {
    }


    getTasks(): Observable<any>{
        return this.http.get('/api/tasks');
    }

    saveTask(task:Task, checked:boolean): Observable<any>{
        task.completed=checked;
        return this.http.post('/api/tasks/save',task);
    }

}
