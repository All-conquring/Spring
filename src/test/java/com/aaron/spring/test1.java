package com.aaron.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aaron.entity.Computer;
import com.aaron.entity.Printer;
import com.aaron.entity.User;

import junit.framework.TestCase;

public class test1 extends TestCase{
	
	public void testIoc(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user = (User)context.getBean("timo");
		user.sayHello();
	}
	
	public void testPrinter(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Printer printer = (Printer)context.getBean("hp");
		printer.print();
	}
	
	public void testComputer(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Computer com = (Computer)context.getBean("computer");
		com.assmbly();
	}

}
