package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach = context.getBean(Coach.class);
		Coach coach2 = context.getBean(Coach.class);
		
		System.out.println(coach);
		System.out.println(coach2);
		
		context.close();
	}

}
