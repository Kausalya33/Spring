package com.kgfsl.springbootconfig.controller;

import com.kgfsl.springbootconfig.model.Employee;
import com.kgfsl.springbootconfig.repository.EmployeeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"/employee"})
public class EmployeeController {

    @Autowired
    private EmployeeRepository repo;
    
  @RequestMapping(method = RequestMethod.GET)
  public List<Employee> findData() {
    return repo.findAll();
  }
  
  @RequestMapping(value = "/{id}",method = RequestMethod.GET)
  public Employee findone(@PathVariable Integer id) {
    return  repo.findOne(id);
  }
  
  @RequestMapping(method = RequestMethod.POST)
  public Employee addData(@RequestBody Employee data) {
    data.setId(null);
    return repo.saveAndFlush(data);
  }
  
  @RequestMapping(value = "/{id}", method = RequestMethod.POST)
  public Employee updateData(@RequestBody Employee updatedData, @PathVariable Integer id) {
    updatedData.setId(id);
    return repo.saveAndFlush(updatedData);
  }
  
  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public void deleteData(@PathVariable Integer id) {
    repo.delete(id);
  }
}
