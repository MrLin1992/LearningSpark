package com.linshangzhen.learningjava.learningjava.designpatterns.observer;

public interface Subject {
	public void add(Observer observer);
	public void delte(Observer observer);
	public void ntifyObserver();
	public void operation();

}
