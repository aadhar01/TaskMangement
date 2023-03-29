package com.taskmanagement.taskmanagementsystem.repository;


import com.taskmanagement.taskmanagementsystem.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


// This extends the JpaRepo which provides the basic CRUD operations to the Task entity
// With the TaskRepo, we can perform the databases operations on the Task entity
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
