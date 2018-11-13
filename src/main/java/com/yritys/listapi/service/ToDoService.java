/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yritys.listapi.service;

import com.yritys.listapi.jpa.ToDo;
import com.yritys.listapi.jpa.ToDoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Tommi
 */
@Service
public class ToDoService {
    
    @Autowired
    private ToDoRepository toDoRepository;
    
    public List getAllTasks(){
        return this.toDoRepository.findAll();
    }
    
    public void addTask(ToDo todo){
        this.toDoRepository.saveAndFlush(todo);
    }
    
    public Optional<ToDo> getTask(Long id){
        return this.toDoRepository.findById(id);
    }
    
}
