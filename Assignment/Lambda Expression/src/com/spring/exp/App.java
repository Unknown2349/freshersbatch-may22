package com.spring.exp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
              ("NewFile.xml");
    Employee emp = (Employee)context.getBean("employee");
    System.out.println("Office address " + emp.getOfficeAddress().getNumber());
    System.out.println("Location of office " + emp.getOfficeLocation());
    System.out.println("Employee info " + emp.getEmployeeInfo());
  }
}