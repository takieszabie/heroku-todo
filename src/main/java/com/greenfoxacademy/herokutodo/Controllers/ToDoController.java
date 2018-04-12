package com.greenfoxacademy.herokutodo.Controllers;

import com.greenfoxacademy.herokutodo.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
  @RequestMapping(value = {"/add"})
  public String showAddForm(Model model) {
    return "addform";
  }

}
