package com.linshangzhen.learningjava.learningjava.designpatterns.observer;

public class Test {
	public static void main(String[] args) {
		Subject s = new MySubject();
		Observer o1 = new Observer1();
		Observer o2 = new Observer2();
		s.add(o1);
		s.add(o2);
//		s.ntifyObserver();
		s.operation();
	}

}
