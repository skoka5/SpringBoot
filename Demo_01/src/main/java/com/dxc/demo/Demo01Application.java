package com.dxc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.dxc.beans.Person;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.net.SyslogOutputStream;

@ComponentScan("com.dxc.beans")
@SpringBootApplication
public class Demo01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Demo01Application.class, args);
	    Person person = context.getBean(Person.class);
	    person.show();
		
	}

}
