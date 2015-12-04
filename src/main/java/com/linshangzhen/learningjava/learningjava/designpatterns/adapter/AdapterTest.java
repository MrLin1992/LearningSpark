package com.linshangzhen.learningjava.learningjava.designpatterns.adapter;

public class AdapterTest {

	public static void main(String[] args) {
		Targetable target = new Adapter();
		target.method1();
		target.method2();

	}

}
