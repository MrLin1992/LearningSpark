package com.linshangzhen.learningjava.learningjava.foundation.enumtest;

public abstract class WeekDay {
	private WeekDay(){
		
	}
	
	
	public abstract WeekDay nextDay();
	
	public static final WeekDay SUN = new WeekDay() {
		
		@Override
		public WeekDay nextDay() {
			return MON;
		}
	};
	
	public static final WeekDay MON = new WeekDay() {
		
		@Override
		public WeekDay nextDay() {
			return SUN;
		}
	};
	
	public String toString(){
		System.out.println("hehehheheh");
		if(this==SUN){
			return "this is sunday";
		}else{
			return "this is monday";
		}
		
	}

}
