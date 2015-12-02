package com.linshangzhen.learningjava.learningjava.pattern.factorymethod;

public class SendFactory {
	public Sender produce(String type){
		if("mail".equals(type)){
			return new MailSender();
		}else if("sms".equals(type)){
			return new SmsSender();
		}else{
			System.out.println("请输入合法的输入");
		}
		int x = 0;
		return null;
	}

}
