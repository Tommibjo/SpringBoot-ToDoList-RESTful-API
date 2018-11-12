/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yritys.listapi.controller;

import com.yritys.listapi.service.ToDoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Tommi
 */
@RestController
public class ToDoController {
    
    @Autowired
    private ToDoService toDoService;
   
    // /todo -> palauttaa koko listan.
    @RequestMapping(value="/todo", method=RequestMethod.GET)
    public List todo(){
        return this.toDoService.getAllTasks();
    }
    
    // /todo/id -> palauttaa valitun ID:n tehtävän tiedot.
    @RequestMapping(value="/todo/{id}", method=RequestMethod.GET)
    public String todoId(Model model, @PathVariable Integer id){
         return null;
    }
    
}
