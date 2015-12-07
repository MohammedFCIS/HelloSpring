package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
	  ApplicationContext context = 
             new ClassPathXmlApplicationContext("Beans.xml");

	  /* HelloSpring obj = (HelloSpring) context.getBean("helloSpring");

      obj.getMessage1();
      obj.getMessage2();
      
      HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
      objB.getMessage1();
      objB.getMessage2();
      objB.getMessage3();*/

       TextEditor te = (TextEditor) context.getBean("textEditor");

       te.spellCheck();
   }
}