import {HttpClient} from '@angular/common/http';
import {Injectable} from "@angular/core";
import {Observable} from "rxjs";


@Injectable()
export class TaskService{


    constructor(private http: HttpClient) {
    }


    getTasks(): Observable<any>{
        return this.http.get('/api/tasks');
    }

}
