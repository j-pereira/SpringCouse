package com.luv2code.springdemo;

//SwimCoach doesn't have @Component cause the bean is defined in SportConfig class
public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;

	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swim!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
