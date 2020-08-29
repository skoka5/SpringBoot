package com.dxc.beans;

import org.springframework.stereotype.Component;

@Component
public class Computer {
 int id;
 String brang;
public Computer() {
	super();
	// TODO Auto-generated constructor stub
}
public Computer(int id, String brang) {
	super();
	this.id = id;
	this.brang = brang;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBrang() {
	return brang;
}
public void setBrang(String brang) {
	this.brang = brang;
}
@Override
public String toString() {
	return "Computer [id=" + id + ", brang=" + brang + "]";
}
}
