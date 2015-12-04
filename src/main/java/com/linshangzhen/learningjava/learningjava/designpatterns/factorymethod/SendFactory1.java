package com.linshangzhen.learningjava.learningjava.designpatterns.factorymethod;

public class SendFactory1 {
	public Sender produceMail(){
		return new MailSender();
	}
	
	public Sender produceSms(){
		return new SmsSender();
	}

}
