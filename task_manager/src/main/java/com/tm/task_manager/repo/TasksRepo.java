package com.tm.task_manager.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tm.task_manager.model.Tasks;

public interface TasksRepo extends JpaRepository<Tasks, Long> {

}
