package com.mariadb.foodorderingsystem.model;

import java.util.Date;

public class Waiter {
private int id;
private String firstName;
private String lastName;
private Date doj;
private String contact;
public Waiter(){}


public Waiter(int id, String firstName, String lastName, Date doj, String contact) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.doj = doj;
	this.contact = contact;
}


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public Date getDoj() {
	return doj;
}
public void setDoj(Date doj) {
	this.doj = doj;
}
public String getContact(){
	return contact;
}
public void SetContact(String contact){
	this.contact=contact;
}

}
