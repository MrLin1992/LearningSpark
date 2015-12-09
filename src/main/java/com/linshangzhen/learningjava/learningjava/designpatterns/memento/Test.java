package com.linshangzhen.learningjava.learningjava.designpatterns.memento;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Original o = new Original("original");
		
		Memento m = o.createMemento();
		
		System.out.println(o.getValue());
		
		o.setValue("changed");
		
		System.out.println(o.getValue());
		
		o.restoreMemento(m);
		
		System.out.println(o.getValue());

	}

}
