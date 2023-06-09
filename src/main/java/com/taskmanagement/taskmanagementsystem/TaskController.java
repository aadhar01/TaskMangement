package com.taskmanagement.taskmanagementsystem;

import com.taskmanagement.taskmanagementsystem.entity.Task;
import com.taskmanagement.taskmanagementsystem.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;


    @GetMapping("/")
    public String showTasks(Model model){
        model.addAttribute("tasks", taskRepository.findAll());
        return "index";
    }

    @PostMapping("/saveTask")
    public String saveTask(@RequestParam String title, @RequestParam String description, @RequestParam LocalDate dueDate, @RequestParam boolean completed, Model model) {
        Task newTask = new Task();
        newTask.setTitle(title);
        newTask.setDescription(description);
        newTask.setDueDate(dueDate);
        newTask.setCompleted(completed);
        taskRepository.save(newTask);
        model.addAttribute("tasks", taskRepository.findAll());
        return "index";
    }

}
