package com.kasun.tasksapp.service;

import com.kasun.tasksapp.domain.Task;
import com.kasun.tasksapp.repository.TaskRepository;
import org.springframework.stereotype.Service;

/**
 * *@author KasunBalasooriya
 * *@date 2021-09-23 6:18 PM
 */

@Service
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> list() {
        return this.taskRepository.findAll();
    }

    @Override
    public Task save(Task task) {
        return this.taskRepository.save(task);
    }

}
