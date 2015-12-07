package com.linshangzhen.learningjava.learningjava.designpatterns.templatemethod;

public class TemplateMethodTest {
	public static void main(String[] args) {
		AbstractCalculator calculator = new Plus();
		System.out.println(calculator.calculate("5+4","\\+"));
	}

}
