package com.web.DemoSpring.entity;

import org.springframework.stereotype.Component;

@Component("bk")
public class Bike implements Vehicle {
	private int regno;
	private String brand;
	private double cost;
	public Bike() {
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
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Bike";
	}
	public void pickUp()
	{
		System.out.println("Get on the Bike");
	}
	public void drop() {
		System.out.println("Sir Pls get down");
	}
	
}
