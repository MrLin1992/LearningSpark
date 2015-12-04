package com.linshangzhen.learningjava.learningjava.designpatterns.proxy;

public class ProxyTest {
	public static void main(String[] args) {
		Sourceable source = new Proxy();
		source.method();
	}
}
