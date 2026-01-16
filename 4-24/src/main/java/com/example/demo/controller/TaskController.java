package com.example.demo.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.TaskEntity;
import com.example.demo.form.TaskForm;
import com.example.demo.service.TaskService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/task")
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    // 一覧
    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("taskList", service.findAll());
        return "task/list";
    }

    // 登録画面
    @GetMapping("/add")
    public String add(TaskForm form) {
        return "task/add";
    }

    // 登録
    @PostMapping("/add")
    public String add(@Valid TaskForm form, BindingResult result) {
        if (result.hasErrors()) {
            return "task/add";
        }
        TaskEntity entity = new TaskEntity();
        BeanUtils.copyProperties(form, entity);
        service.insert(entity);
        return "redirect:/task/list";
    }

    // 編集画面
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        TaskEntity entity = service.findById(id);
        TaskForm form = new TaskForm();
        BeanUtils.copyProperties(entity, form);
        model.addAttribute("taskForm", form);
        return "task/edit";
    }

    // 更新
    @PostMapping("/edit")
    public String edit(@Valid TaskForm form, BindingResult result) {
        if (result.hasErrors()) {
            return "task/edit";
        }
        TaskEntity entity = new TaskEntity();
        BeanUtils.copyProperties(form, entity);
        service.update(entity);
        return "redirect:/task/list";
    }

    // 削除
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        service.delete(id);
        return "redirect:/task/list";
    }
}
