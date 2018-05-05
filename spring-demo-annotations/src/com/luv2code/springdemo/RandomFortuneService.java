package com.luv2code.springdemo;

import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] data;
	private Random random;
	
	
	@PostConstruct
	public void setupData() {
		data = new String[4];
		data[0] = "Random 1";
		data[1] = "Random 2";
		data[2] = "Random 3";
		data[3] = "Random 4";
		
		random = new Random();
	}
	
	@Override
	public String getFortune() {
		return data[random.nextInt(data.length)] ;
	}

}
