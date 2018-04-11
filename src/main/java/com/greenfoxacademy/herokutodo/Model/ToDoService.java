package com.greenfoxacademy.herokutodo.Model;

import com.greenfoxacademy.herokutodo.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ToDoService {
  @Autowired
  ToDoRepository toDoRepository;

  public void addToDo(ToDo toDo) {
    toDoRepository.save(toDo);
  }
}
