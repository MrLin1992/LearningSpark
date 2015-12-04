package com.linshangzhen.learningjava.learningjava.designpatterns.decorator;

public class Decorator implements Sourceable {
	
	private Sourceable source;
	
	public Decorator(Sourceable source) {
		// TODO Auto-generated constructor stub
		super();
		this.source = source;
		
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("new");
		source.method();

	}

}
