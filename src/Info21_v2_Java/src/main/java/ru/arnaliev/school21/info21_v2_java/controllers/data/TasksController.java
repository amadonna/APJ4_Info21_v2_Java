package ru.arnaliev.school21.info21_v2_java.controllers.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.arnaliev.school21.info21_v2_java.model.Peer;
import ru.arnaliev.school21.info21_v2_java.model.Tasks;
import ru.arnaliev.school21.info21_v2_java.service.TasksService;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/data")
public class TasksController {
    private final TasksService service;

    @Autowired
    public TasksController(TasksService service) {
        this.service = service;
    }
    @RequestMapping("/tasks")
    public String getTasks(Model model) {
        List<Tasks> tasks = service.findAll();
        model.addAttribute("tasks", tasks);
        return "data/tasks";
    }
}
