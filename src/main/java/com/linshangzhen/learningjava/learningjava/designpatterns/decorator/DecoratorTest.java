package com.linshangzhen.learningjava.learningjava.designpatterns.decorator;

public class DecoratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sourceable source = new Source();
		Decorator decorator = new Decorator(source);
		decorator.method();

	}

}
