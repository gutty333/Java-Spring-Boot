package com.springBasic.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class TodoTask {
    private static int idCounter = 0;

    private int id = idCounter++;
    private String title;
    private String description;

    private TodoTaskStatus status = TodoTaskStatus.NOT_STARTED;
    private Date dueDate;
    private Date createdAt = Date.from(java.time.Instant.now());
}
