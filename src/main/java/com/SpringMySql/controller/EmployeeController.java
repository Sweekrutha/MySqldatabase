package com.SpringMySql.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringMySql.controller.model.EmployeeStGtMethod;
import com.SpringMySql.services.EmployeeServices;

@RestController
public class EmployeeController {
@Autowired
private EmployeeServices empRepo;
@GetMapping("/user")
public List<EmployeeStGtMethod> getAll()
{
	return empRepo.findAll();
}
@GetMapping("/user/{Id}")
public Optional<EmployeeStGtMethod> getfindOne(@PathVariable int Id)
{
	return empRepo.findOne(Id);
	
}
@PutMapping("/user")
public void getupdateOne(@PathVariable int Id, @RequestBody EmployeeStGtMethod empStGt)
{
	empRepo.updateOne(Id,empStGt);
}
@DeleteMapping("/user/{Id}")
public void getdeleteOne(@PathVariable int Id)
{
	empRepo.deleteOne(Id);
}
@PostMapping("/user")
public void getsaveOne(@RequestBody EmployeeStGtMethod empStGt)
{
	empRepo.saveOne(empStGt);
}
}

