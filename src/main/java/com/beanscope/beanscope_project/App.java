package com.beanscope.beanscope_project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "progarm started!" );
        ApplicationContext con = new ClassPathXmlApplicationContext("beanscope.xml");
        Person p =con.getBean("person",Person.class);
        System.out.println(p.hashCode());
        Person p1 =con.getBean("person",Person.class);
        System.out.println(p1.hashCode());
        System.out.println("program ended");
    }
}
