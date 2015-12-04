package com.linshangzhen.learningjava.learningjava.designpatterns.adapter;

public class Wrapper implements Targetable {
	
	private Source source;
	
	public Wrapper(Source source) {
		super();
		this.source = source;
	
	}

	@Override
	public void method1() {
		System.out.println("this is method2");

	}

	@Override
	public void method2() {

		source.method1();
	}

}
