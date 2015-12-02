package com.linshangzhen.learningjava.learningjava.pattern.abstractfactory;

import org.junit.Test;

public class AbstractFactoryTest {
	
	@Test
	public void testSend(){
		Provider p = new SendSmsFactory();
		Sender sender =  p.produce();
		sender.send();
		
	}

}
