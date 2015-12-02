package com.linshangzhen.learningjava.learningjava.pattern.abstractfactory;

public class SendMailFactory implements Provider {

	public Sender produce() {
		return new MailSender();
	}

}
