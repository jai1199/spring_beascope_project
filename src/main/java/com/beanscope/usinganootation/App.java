package com.beanscope.usinganootation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
 public static void main(String[] args) 
 {
	ApplicationContext con = new ClassPathXmlApplicationContext("annotation.xml");
	Employee emp = con.getBean("employee",Employee.class);
	System.out.println(emp.hashCode());
	Employee emp1 = con.getBean("employee",Employee.class);
	System.out.println(emp1.hashCode());
 }
}
