package com.example.tododemo.repository;

import com.example.tododemo.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TaskRepository extends JpaRepository<Task, Long> {


}
