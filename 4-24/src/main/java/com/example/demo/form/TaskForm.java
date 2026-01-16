package com.example.demo.form;

import jakarta.validation.constraints.NotBlank;

public class TaskForm {

    private Integer taskId;

    @NotBlank
    private String taskName;

    @NotBlank
    private String taskStatus;

    public Integer getTaskId() {
        return taskId;
    }
    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }
    public String getTaskName() {
        return taskName;
    }
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
    public String getTaskStatus() {
        return taskStatus;
    }
    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }
}
