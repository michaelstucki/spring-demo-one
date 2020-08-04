package com.luv2code.springdemo;

public class JudoCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public JudoCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Master says to Do 5000 pushups on gravel. Hajime!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
