package com.linshangzhen.learningjava.learningjava.designpatterns.facade;

public class User {
	public static void main(String[] args) {
		Computer computer = new Computer();  
		computer.startup();
        computer.shutdown();
        
	}

}
