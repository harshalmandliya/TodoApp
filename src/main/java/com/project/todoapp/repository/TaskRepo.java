package com.project.todoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.todoapp.models.Task;

public interface TaskRepo extends JpaRepository<Task, Long>{

}
