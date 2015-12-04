package com.linshangzhen.learningjava.learningjava.designpatterns.adapter;

public class Wrapper1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sourceable source = new Wrapper1();
		Sourceable stub1 = new SourceStub1();
		Sourceable stub2 = new SourceStub2();
		
		source.method1();
		source.method2();
		stub1.method1();
		stub1.method2();
		stub2.method1();
		stub2.method2();

	}

}
