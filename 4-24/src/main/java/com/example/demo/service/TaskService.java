package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.TaskEntity;
import com.example.demo.mapper.TaskMapper;

@Service
public class TaskService {

    private final TaskMapper mapper;

    public TaskService(TaskMapper mapper) {
        this.mapper = mapper;
    }

    public List<TaskEntity> findAll() {
        return mapper.findAll();
    }

    public TaskEntity findById(Integer id) {
        return mapper.findById(id);
    }

    public void insert(TaskEntity task) {
        mapper.insert(task);
    }

    public void update(TaskEntity task) {
        mapper.update(task);
    }

    public void delete(Integer id) {
        mapper.delete(id);
    }
}
