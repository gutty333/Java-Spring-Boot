package com.springBasic.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.util.Date;


@Builder
@Jacksonized
@Data
@Entity
public class TodoTask {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     int id;

     @NotNull(message = "Title cannot be null")
     String title;
     String description;
     TodoTaskStatus status = TodoTaskStatus.NOT_STARTED;
     Date dueDate;

     @NotNull(message = "Created date cannot be null")
     Date createdAt = Date.from(java.time.Instant.now());
}
