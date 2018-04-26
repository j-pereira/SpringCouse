package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach coach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		boolean result = (coach == alphaCoach);
		
		System.out.println("Same obj: " + result);
		
		System.out.println("Memory coach: " + coach);
		
		System.out.println("Memory alphaCoach: " + alphaCoach);

		context.close();
	}

}
