package com.javatrialspring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javatrialspring.models.entities.ToDo;
import com.javatrialspring.repository.RepoToDo;

@Service
@Transactional
public class ServiceToDo {

    @Autowired
    private RepoToDo repoToDo;

    public ToDo save(ToDo todo) {
        return repoToDo.save(todo);
    }

    public ToDo findById(Long id) {
        Optional<ToDo> todo = repoToDo.findById(id);
        if (!todo.isPresent()) {
            return null;
        }
        return todo.get();
    }

    public Iterable<ToDo> findAll() {
        return repoToDo.findAll();
    }
    
    public void delete(Long id) {
        repoToDo.deleteById(id);
    }
    
    public List<ToDo> findByName(String name) {
        return repoToDo.findByName(name);
    }
    
}
