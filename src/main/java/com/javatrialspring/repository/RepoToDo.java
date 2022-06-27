package com.javatrialspring.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.javatrialspring.models.entities.ToDo;

public interface RepoToDo extends CrudRepository<ToDo> {
    
    List<ToDo> findByName(String name);
}
