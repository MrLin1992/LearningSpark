package com.linshangzhen.learningjava.learningjava.designpatterns.prototype;

public class ProtoType implements Cloneable {
	
	public Object clone() throws CloneNotSupportedException{
		ProtoType protoType = (ProtoType) super.clone();
		return protoType;
	}

}
