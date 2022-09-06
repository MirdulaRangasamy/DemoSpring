package com.web.DemoSpring.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.web.DemoSpring.entity"})
public class AutoConfig {

}
