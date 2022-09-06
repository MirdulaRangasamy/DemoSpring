package com.web.DemoSpring.entity;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Car implements Vehicle {
	private int regno;
	private String brand;
	private String color;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Car";
	}
	public void pickUp()
	{
		System.out.println("Get Inside Car");
	}
	public void drop() {
		System.out.println("Get Out of Pardhi's Car");
	}
}
