package com.linshangzhen.learningjava.learningjava.pattern.builder;

import java.util.List;

public class BuilderTest {
	public static void main(String[] args){
		Builder builder = new Builder();
		builder.produceMailSender(5);
		builder.produceSmsSender(10);
		
		List<Sender> list = builder.getList();
		for(Sender s:list){
			s.send();
		}
	}

}
