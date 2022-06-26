package com.spring.awar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
	public static void main(String[] args) {
		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("Cont.xml");
		Aware appcontext= (Aware)context.getBean("appcontext");
		ApplicationContext appCon =appcontext.getContext();
		App app= (App)appCon.getBean("testApp");
		app.doTask();
		context.registerShutdownHook();
	}
} 