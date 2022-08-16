package com.SpringMySql.controller.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="NewEmp")
public class EmployeeStGtMethod {
@Id
@GeneratedValue(strategy =GenerationType.AUTO )
private Integer id;
@Column(name="Name")
private String Name;
@Column(name="Name")
private String Dec;
public EmployeeStGtMethod()
{
}
public EmployeeStGtMethod(Integer id, String name, String dec) {
	super();
	this.id = id;
	Name = name;
	Dec = dec;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getDec() {
	return Dec;
}
public void setDec(String dec) {
	Dec = dec;
}
}
