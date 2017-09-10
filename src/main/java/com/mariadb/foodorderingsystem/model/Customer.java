package com.mariadb.foodorderingsystem.model;

public class Customer {
 private int id;
 private String firstName;
 private String lastName;
 private char gender;
 private int age;
 private String address;
 private String phoneNumber;
 
 public Customer(){};
 public Customer(int id, String firstName, String lastName, char gender, int age, String address, String phoneNumber){
	 
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
public char getGender() {
	return gender;
}
public void setGender(char gender) {
	this.gender = gender;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
 
}
