package com.web.DemoSpring.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Driver {
	private int id;
	private String name;
	
	@Autowired
	@Qualifier("bk")
	private Vehicle v;
	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Vehicle getV() {
		return v;
	}
	public void setV(Vehicle v) {
		this.v = v;
	}
	@Override
	public String toString() {
		return "Driver [id=" + id + ", name=" + name + ", v=" + v + "]";
	}
	public void drive()
	{
		System.out.println(name+" is driving "+v);
	}
}
