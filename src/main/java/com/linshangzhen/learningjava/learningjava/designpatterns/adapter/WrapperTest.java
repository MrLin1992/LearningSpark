package com.linshangzhen.learningjava.learningjava.designpatterns.adapter;

public class WrapperTest {

	public static void main(String[] args) {
		
		Source source = new Source();

		Targetable target = new Wrapper(source);
		target.method1();
		target.method2();
		
	}

}
