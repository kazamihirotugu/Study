package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.TaskEntity;

@Mapper
public interface TaskMapper {

    List<TaskEntity> findAll();
    TaskEntity findById(Integer taskId);
    void insert(TaskEntity task);
    void update(TaskEntity task);
    void delete(Integer taskId);
}
