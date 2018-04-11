package com.greenfoxacademy.herokutodo.Repository;


import com.greenfoxacademy.herokutodo.Model.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<ToDo, Long> {
}
