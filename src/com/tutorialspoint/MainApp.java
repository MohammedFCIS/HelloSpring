package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
	   AbstractApplicationContext context = 
             new ClassPathXmlApplicationContext("Beans.xml");

      HelloSpring obj = (HelloSpring) context.getBean("helloSpring");

      obj.getMessage();
      context.registerShutdownHook();
   }
}