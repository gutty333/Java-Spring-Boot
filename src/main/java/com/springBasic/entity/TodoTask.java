package com.springBasic.entity;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

import java.util.Date;


@Builder
@Jacksonized
@Value
public class TodoTask {
     static int idCounter = 0;

     int id = idCounter++;
     String title;
     String description;

     TodoTaskStatus status = TodoTaskStatus.NOT_STARTED;
     Date dueDate;
     Date createdAt = Date.from(java.time.Instant.now());
}
