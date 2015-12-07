package com.linshangzhen.learningjava.learningjava.designpatterns.observer;

public class MySubject extends AbstractSubject {

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("self");
		ntifyObserver();
	}

}
