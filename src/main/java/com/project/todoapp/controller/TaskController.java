package com.project.todoapp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.todoapp.models.Task;
import com.project.todoapp.services.TaskService;

@Controller
public class TaskController {
TaskService taskservice;
public TaskController(TaskService taskservice) {
	this.taskservice =taskservice;
}
@GetMapping
public String getTasks(Model model) {
	List<Task> tasks=taskservice.getAllTask();
	model.addAttribute("tasks",tasks);
	return "tasks";
}
@PostMapping
public String AddTask(@RequestParam String title) {
	taskservice.addTask(title);
	return "redirect:/";
}
@GetMapping("/{id}/delete")
public String deleteTask(@PathVariable Long id) {
	taskservice.deleteTask(id);
	return "redirect:/";
}
@GetMapping("/{id}/toggle")
public String toggleTask(@PathVariable Long id) {
	taskservice.toggleTask(id);
	return "redirect:/";
}
}
