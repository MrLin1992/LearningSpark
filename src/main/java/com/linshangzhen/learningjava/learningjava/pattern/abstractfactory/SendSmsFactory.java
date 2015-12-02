package com.linshangzhen.learningjava.learningjava.pattern.abstractfactory;

public class SendSmsFactory implements Provider {

	public Sender produce() {
		return new SmsSender();
	}

}
