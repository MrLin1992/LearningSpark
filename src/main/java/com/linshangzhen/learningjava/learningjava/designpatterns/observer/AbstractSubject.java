package com.linshangzhen.learningjava.learningjava.designpatterns.observer;

import java.util.Iterator;
import java.util.Vector;

public abstract class AbstractSubject implements Subject {
	
	private Vector<Observer> observers = new Vector<Observer>();

	@Override
	public void add(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);

	}

	@Override
	public void delte(Observer observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);

	}

	@Override
	public void ntifyObserver() {
		// TODO Auto-generated method stub
		Iterator<Observer> i = observers.iterator();
		while(i.hasNext()){
			i.next().update();
		}

	}


}
