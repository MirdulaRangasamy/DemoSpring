package com.web.DemoSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.web.DemoSpring.configuration.AutoConfig;
import com.web.DemoSpring.entity.Driver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	ApplicationContext context = new AnnotationConfigApplicationContext(AutoConfig.class);
    	//Car c = context.getBean(Car.class);
    	Driver d = context.getBean(Driver.class);
    	d.setName("Mirdu");
    	d.drive();
    }
}
