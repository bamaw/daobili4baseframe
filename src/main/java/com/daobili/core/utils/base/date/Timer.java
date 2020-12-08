package com.daobili.core.utils.base.date;

public class Timer {
	public Timer() {
		super();
		this.startTime=System.currentTimeMillis();
	}
	
	public Long secs(){
		return DateCalc.apartSecond(startTime,System.currentTimeMillis());
	}
	
	public Long mins(){
		return DateCalc.apartMinute(startTime,System.currentTimeMillis());
	}
	
	private Long startTime;

	public static void main(String[] args) {
		Timer timer = new Timer();
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(timer.secs());
		System.out.println(timer.mins());
	}
}
