package com.linshangzhen.learningjava.learningjava.designpatterns.Singleton;


public class Singleton {

//	private static Singleton instance = null;

	private Singleton() {

	}

//	public static Singleton getInstance() {
//		if (instance == null) {
//			synchronized (instance) {
//				if (instance == null) {
//					instance = new Singleton();
//				}
//			}
//		}
//		return instance;
//	}
	
	private static class SingletonFactory{
		private static Singleton instance = new Singleton();
		
	}
	
	public static Singleton getIntance(){
		return SingletonFactory.instance;
	}

	public Object readResolve() {
		return getIntance();
	}
	

}
