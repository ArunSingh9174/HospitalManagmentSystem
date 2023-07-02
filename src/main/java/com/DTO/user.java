package com.DTO;

public class user {
 private String name;
 private String password;
 private String contect;
 private String email;
 private String address;
 private String state;
 private String country;
public user(String name, String password, String contect, String email, String address, String state, String country) {
	super();
	this.name = name;
	this.password = password;
	this.contect = contect;
	this.email = email;
	this.address = address;
	this.state = state;
	this.country = country;
}
public user() {
	super();
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getContect() {
	return contect;
}
public void setContect(String contect) {
	this.contect = contect;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
@Override
public String toString() {
	return "user [name=" + name + ", password=" + password + ", contect=" + contect + ", email=" + email + ", address="
			+ address + ", state=" + state + ", country=" + country + "]";
}
 
 
 
}
