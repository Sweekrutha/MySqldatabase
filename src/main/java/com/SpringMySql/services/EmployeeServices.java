package com.SpringMySql.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.SpringMySql.Repository.EmployeeRepository;
import com.SpringMySql.controller.model.EmployeeStGtMethod;

@Service
@Component
public class EmployeeServices {
@Autowired
private EmployeeRepository empRepo;
//
//@GetMapping("/user")
public List<EmployeeStGtMethod> findAll()
{
	 List<EmployeeStGtMethod> userdata=new ArrayList<>();
	 empRepo.findAll().forEach(userdata::add);
	 return userdata;
}
//@GetMapping("/user/{Id}")
public Optional<EmployeeStGtMethod> findOne(int Id)
{
	return empRepo.findById(Id);
}
//@PutMapping("/user")
public void updateOne(int Id,EmployeeStGtMethod empStGt)
{
	empRepo.save(empStGt);
}
//@DeleteMapping("/user/{Id}")
public void deleteOne(int Id)
{
	empRepo.deleteById(Id);
}
//@PostMapping("/user")
public void saveOne(EmployeeStGtMethod empStGt)
{
	empRepo.save(empStGt);
}
}
