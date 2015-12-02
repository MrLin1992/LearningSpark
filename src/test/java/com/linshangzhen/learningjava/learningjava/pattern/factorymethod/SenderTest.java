package com.linshangzhen.learningjava.learningjava.pattern.factorymethod;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class SenderTest {
	
	private SendFactory sf;
	private SendFactory1 sf1;
//	private SendFactory2 sf2;
	
	@Before
	public void setUp(){
		sf = new SendFactory();
		sf1 = new SendFactory1();
//		sf2 = new SendFactory2();
	}
	
	@Ignore
	public void testSendFactory(){
		Sender sender = sf.produce("mail");
		sender.send();
	}
	
	@Ignore
	public void testSendFactory1(){
		Sender sender = sf1.produceSms();
		sender.send();
	}
	
	@Test
	public void testSendFactory2(){
		Sender sender = SendFactory2.produceMail();
		sender.send();
		
	}
	

}
