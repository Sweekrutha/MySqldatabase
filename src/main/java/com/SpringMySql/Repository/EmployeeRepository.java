package com.SpringMySql.Repository;

import org.springframework.data.repository.CrudRepository;

import com.SpringMySql.controller.model.EmployeeStGtMethod;

public interface EmployeeRepository extends CrudRepository<EmployeeStGtMethod,Integer>
{


}
