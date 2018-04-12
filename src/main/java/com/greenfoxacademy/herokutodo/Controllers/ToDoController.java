package com.greenfoxacademy.herokutodo.Controllers;

import com.greenfoxacademy.herokutodo.Model.ToDo;
import com.greenfoxacademy.herokutodo.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.constraints.Positive;

@Controller
@RequestMapping("/todo")
public class ToDoController {

  @Autowired
  ToDoRepository toDoRepository;

  @RequestMapping(value = {"/", "/list"})
  public String list(Model model) {
    model.addAttribute("todos", toDoRepository.findAll());
    return "todolist";
  }
  @GetMapping("/add")
  public String showAddForm(Model model) {
    return "addform";
  }

  @PostMapping("/add")
  public String addSubmit(@ModelAttribute ToDo toDo) {
    return "result";
  }

}
