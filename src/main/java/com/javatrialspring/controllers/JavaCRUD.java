package com.javatrialspring.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatrialspring.models.entities.ToDo;
import com.javatrialspring.service.ServiceToDo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/v1/todo")
public class JavaCRUD {
    
    @Autowired
    ServiceToDo serviceToDo;

    @PostMapping
    public ToDo save(@RequestBody ToDo todo) {
        return serviceToDo.save(todo);
    }

    @GetMapping("/{id}")
    public ToDo findById(@PathVariable("id") Long id) {
        return serviceToDo.findById(id);
    }

    @GetMapping
    public Iterable<ToDo> findAll() {
        return serviceToDo.findAll();
    }
    
    @PutMapping
    public ToDo update(@RequestBody ToDo todo) {
        return serviceToDo.save(todo);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        serviceToDo.delete(id);
    }
    
    // public List<ToDo> findByName(String name) {
    //     return serviceToDo.findByName(name);
    // }
 
} 