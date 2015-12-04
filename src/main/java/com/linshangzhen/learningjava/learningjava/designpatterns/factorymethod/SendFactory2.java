package com.linshangzhen.learningjava.learningjava.designpatterns.factorymethod;

import java.sql.SQLNonTransientConnectionException;
import java.util.Vector;

public class SendFactory2 {
	public static Sender produceMail(){
		return new MailSender();
	}
	
	public static Sender produceSms(){
		return new SmsSender();
	}

}
