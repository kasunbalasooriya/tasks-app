package com.kasun.tasksapp.repository;

import com.kasun.tasksapp.domain.Task;
import org.springframework.data.repository.CrudRepository;

/**
 * *@author KasunBalasooriya
 * *@date 2021-09-23 6:18 PM
 */

public interface TaskRepository extends CrudRepository<Task,Long> {

}
