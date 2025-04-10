package com.taskmanagement.repository;

import com.taskmanagement.entity.Task;
import com.taskmanagement.entity.TaskStatus;
import com.taskmanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByCreatedByOrAssignedTo(Long userId, Long assignedToId);
    List<Task> findByCreatedBy(Long userId);
    List<Task> findByAssignedTo(Long userId);
    List<Task> findByStatus(TaskStatus status);
    List<Task> findByAssignedToAndStatus(User user, TaskStatus status);
} 