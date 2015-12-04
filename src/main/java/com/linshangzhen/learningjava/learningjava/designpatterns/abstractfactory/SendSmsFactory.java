package com.linshangzhen.learningjava.learningjava.designpatterns.abstractfactory;

public class SendSmsFactory implements Provider {

	public Sender produce() {
		return new SmsSender();
	}

}
