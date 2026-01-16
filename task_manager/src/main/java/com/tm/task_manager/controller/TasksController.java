package com.tm.task_manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tm.task_manager.model.Tasks;
import com.tm.task_manager.repo.TasksRepo;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/tasks")
public class TasksController {

    @Autowired
    private TasksRepo tasksRepo;

    @PostMapping("/create")
    @Tag(name = "Tasks", description = "Endpoints for managing tasks")
    public ResponseEntity<String> createTask(Tasks task) {
        Tasks savedTask = tasksRepo.save(task);
        return ResponseEntity.ok("Task created successfully");
    }
}
