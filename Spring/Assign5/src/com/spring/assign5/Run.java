package com.spring.assign5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {
	 
    
    public static void main(String[] args) {
 
        ApplicationContext ac = new ClassPathXmlApplicationContext("Asign5.xml");
 
        Employee emp = ac.getBean("myemployee", Employee.class);
        System.out.println(emp.toString());
    }
}