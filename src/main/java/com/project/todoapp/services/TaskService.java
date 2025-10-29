package com.project.todoapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.todoapp.models.Task;
import com.project.todoapp.repository.TaskRepo;

@Service
public class TaskService {
@Autowired
	TaskRepo taskrepo;
	public List<Task> getAllTask() {
		return taskrepo.findAll();
	}
	public void addTask(String title) {
		Task task=new Task();
		task.setTitle(title);
		task.setCompleted(false);
		taskrepo.save(task);
	}
	public void deleteTask(Long id) {
taskrepo.deleteById(id);	
	}
	public void toggleTask(Long id) {
		Task task=taskrepo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid task id"));
		task.setCompleted(!task.isCompleted());
		taskrepo.save(task);
		
	}

}
