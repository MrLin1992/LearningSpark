package com.linshangzhen.learningjava.learningjava.designpatterns.factorymethod;

public class SmsSender implements Sender {

	public void send() {

		System.out.println("this is sms sender");
	}

}
