package com.linshangzhen.learningjava.learningjava.pattern.abstractfactory;

import org.junit.Test;

import com.linshangzhen.learningjava.learningjava.designpatterns.abstractfactory.Provider;
import com.linshangzhen.learningjava.learningjava.designpatterns.abstractfactory.SendSmsFactory;
import com.linshangzhen.learningjava.learningjava.designpatterns.abstractfactory.Sender;

public class AbstractFactoryTest {
	
	@Test
	public void testSend(){
		Provider p = new SendSmsFactory();
		Sender sender =  p.produce();
		sender.send();
		
	}

}
