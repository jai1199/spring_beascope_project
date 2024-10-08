package com.expression.language;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Solution 
{
 public static void main(String[] args) 
 {
   ApplicationContext con = new ClassPathXmlApplicationContext("exp.xml");
   SpelExp sp = con.getBean("spelexp",SpelExp.class);
   System.out.println(sp);
 }
}
