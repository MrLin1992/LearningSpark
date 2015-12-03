package com.linshangzhen.learningjava.learningjava.foundation.enumtest;

public class EnumTest {

	public static void main(String[] args) throws ClassNotFoundException {
//		WeekDay sun = WeekDay.SUN;
//		System.out.println(sun.nextDay());
//		System.out.println(HH.values());
//		HH aa = HH.a;
//		System.out.println(HH.s);
//		System.out.println(HH.a);
		String qq = "sdfds";
		Class s1 = Class.forName("java.lang.String");
		Class s2 = qq.getClass();
		System.out.println(s1);
	}
	
	public enum HH{
		a(1),s(2),v,g;
		private HH(){
			System.out.println("first");
		}
		private HH(int day){
			System.out.println("second");
		}
	}
	
	public enum TrafficLamp{
		READ(30){

			@Override
			public TrafficLamp nextLamp() {
				return YELLOW;
			}
			
		},GREEN(30){

			@Override
			public TrafficLamp nextLamp() {
				return READ;
			}
			
		},YELLOW(5){

			@Override
			public TrafficLamp nextLamp() {
				return GREEN;
			}
			
		};
		public abstract TrafficLamp nextLamp();
		private int time;
		private TrafficLamp(int time){
			this.time = time;
		}
			
	}
}
