package com.spring.assign5.one;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

 public static void main(String[] args) {

  // ApplicationContext is a Spring interface which 
  // provides with the configuration for an application. 
  // It provides us with all the methods that BeanFactory 
  // provides. It loads the file resources in a older 
  // and generic manner. It helps us to publish events to the
  // listener registered to it. It also provides quick support
  // for internationalization. It provides us with the object 
  // requested, it reads the configuration file and provides
  // us with the necessary object required.
  // We are using concrete implementation of ApplicationContext
  // here called as ClassPathXmlApplicationContext because this 
  // bean factory reads the xml file placed in the classpath of 
  // our application. We provide ClassPathXmlApplicationContext
  // with a configuration file called as inject.xml placed
  // at classpath of our application. 
	 
	 
  ApplicationContext context = 
    new ClassPathXmlApplicationContext(("Inject.xml"));

  // In order to get a object instantiated for a particular bean 
  // we call getBean() method of ClassPathXmlApplicationContext
  // passing it the id for which the object is to be needed. 
  // Here getBean() returns an Object. We need to cast it back 
  // to the Employee object. Without implementing new keyword we 
  // have injected object of Employee just by reading an xml 
  // configuration file.
  Employee employee = (Employee)context.getBean("employee");

  if(employee.getAddress()==null){
   System.out.println("The Employee Name : " + employee.getName());
   System.out.println("The Employee Age : " + employee.getAge());
   System.out.println("The Employee Address : " + "is not provided");
  }
  else{
   System.out.println("The Employee Name : " + employee.getName());
   System.out.println("The Employee Age : " + employee.getAge());
   System.out.println("The Employee Address : " +   
     employee.getAddress().getStreet() + " " +
     employee.getAddress().getCity() + " " +
     employee.getAddress().getState());
  }
 }

}