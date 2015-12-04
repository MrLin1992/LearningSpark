package com.linshangzhen.learningjava.learningjava.designpatterns.abstractfactory;

public class SendMailFactory implements Provider {

	public Sender produce() {
		return new MailSender();
	}

}
