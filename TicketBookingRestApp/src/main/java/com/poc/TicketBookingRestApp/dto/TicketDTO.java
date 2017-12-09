package com.poc.TicketBookingRestApp.dto;

import java.util.Date;

public class TicketDTO {
private String firstName;
private String lastName;
private int age;
private String sex;
private String startLocation;
private String endLocation;
private Date dateOfJourney;

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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public String getStartLocation() {
	return startLocation;
}
public void setStartLocation(String startLocation) {
	this.startLocation = startLocation;
}
public String getEndLocation() {
	return endLocation;
}
public void setEndLocation(String endLocation) {
	this.endLocation = endLocation;
}
public Date getDateOfJourney() {
	return dateOfJourney;
}
public void setDateOfJourney(Date dateOfJourney) {
	this.dateOfJourney = dateOfJourney;
}
	
}
