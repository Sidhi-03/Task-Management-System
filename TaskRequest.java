package com.taskmanagement.payload.request;

import com.taskmanagement.entity.TaskPriority;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import java.time.LocalDateTime;

@Data
public class TaskRequest {
    @NotBlank
    @Size(max = 100)
    private String title;

    @Size(max = 500)
    private String description;

    private TaskPriority priority;

    private LocalDateTime dueDate;

    private Long assignedToId;
} 