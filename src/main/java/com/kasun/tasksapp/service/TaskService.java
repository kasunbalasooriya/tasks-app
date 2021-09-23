package com.kasun.tasksapp.service;

import com.kasun.tasksapp.domain.Task;

/**
 * *@author KasunBalasooriya
 * *@date 2021-09-23 6:18 PM
 */

public interface TaskService {
    Iterable<Task> list();
}
