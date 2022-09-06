package com.web.DemoSpring.entity;

import org.springframework.stereotype.Component;

@Component
public interface Vehicle {
	void pickUp();
	void drop();
}
