package com.kasun.tasksapp.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

/**
 * *@author KasunBalasooriya
 * *@date 2021-09-23 6:17 PM
 */

@Data
@AllArgsConstructor
@Entity
public class Task {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @JsonFormat(pattern = "MM/dd/yyyy")
    private LocalDate dueDate;
    private Boolean completed;
}
