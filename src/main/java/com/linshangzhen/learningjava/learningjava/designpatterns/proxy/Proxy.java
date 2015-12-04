package com.linshangzhen.learningjava.learningjava.designpatterns.proxy;

public class Proxy implements Sourceable {
	
	private Source source;
	
	public Proxy() {
		// TODO Auto-generated constructor stub
		super();
		this.source = new Source();
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("Proxy");
		source.method();

	}

}
