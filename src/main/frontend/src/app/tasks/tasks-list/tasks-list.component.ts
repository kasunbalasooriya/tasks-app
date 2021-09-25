import { Component, OnInit } from '@angular/core';
import {Task} from "../task.model";

@Component({
  selector: 'app-tasks-list',
  templateUrl: './tasks-list.component.html',
  styleUrls: ['./tasks-list.component.css']
})
export class TasksListComponent implements OnInit {

    tasks: Task[] =[];

  constructor() { }

  ngOnInit(): void {
      this.tasks.push(new Task(1, "Task 1", true,"27/01/2021"))
      this.tasks.push(new Task(2, "Task 2", false,"27/01/2021"))
      this.tasks.push(new Task(3, "Task 3", false,"27/01/2021"))
      this.tasks.push(new Task(4, "Task 4", false,"27/01/2021"))
  }

    onTaskChange($event: Event, task: Task) {
        console.log("this task changed "+task.name)
    }

    getDueDateLabel(task: Task) {
        return task.completed ? 'bg-success' : 'bg-primary';
    }
}
