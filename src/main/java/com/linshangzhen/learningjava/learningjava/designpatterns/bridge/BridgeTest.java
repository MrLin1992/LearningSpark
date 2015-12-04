package com.linshangzhen.learningjava.learningjava.designpatterns.bridge;

public class BridgeTest {
	public static void main(String[] args) {
		Bridge bridge = new Bridge();
		
		Sourceable s1 = new Stub1();
		bridge.setSource(s1);
		bridge.method();
		
		Sourceable s2 = new Stub2();
		bridge.setSource(s2);
		bridge.method();
	}

}
