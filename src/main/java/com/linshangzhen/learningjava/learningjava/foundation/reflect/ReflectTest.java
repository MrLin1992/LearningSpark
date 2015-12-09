package com.linshangzhen.learningjava.learningjava.foundation.reflect;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

import javax.activation.FileDataSource;



public class ReflectTest {
	
	public static void main(String[] args) throws NoSuchMethodException, 
	SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException, ClassNotFoundException {
//		Integer a;
		Class StringClass = String.class;
		StringClass.newInstance();
//		Constructor[] s = StringClass.getConstructors();
//		for(int i =0;i<s.length;i++){
//			System.out.println(s[i]);
//		}
		
		Constructor d = String.class.getConstructor(StringBuffer.class);
//		System.out.println(d);
		String x = (String) d.newInstance(new StringBuffer("sadas"));
		System.out.println(x);
		String aaa = String.class.newInstance();

		aaa = "sdfsd";
		ArrayList<String> list = new ArrayList<String>();
		Field qqq = list.getClass().getDeclaredField("size");
		qqq.setAccessible(true);
		System.out.println(qqq.get(list));
	
		
		
		
		Point p = new Point(3, 2);
//		Point p1 = new Point();
		Field ddd = p.getClass().getDeclaredField("x");
		ddd.setAccessible(true);	 
		System.out.println(ddd.get(p));
		String s = "sfsd";
		String d333 = s.replace('s','q');
		System.out.println(d333);
		s.charAt(2);
		
		Method methodCharAt = String.class.getMethod("charAt", int.class);
		System.out.println(methodCharAt.invoke(s, 0));
		
		System.out.println(Arrays.asList(1,2,3));
		int[] as = new int[]{2,3,4};
		System.out.println(Arrays.asList(as));
		System.out.println(as.getClass().getName());
		Class classa = Class.forName("[I");
//		System.out.println(classa.getConstructor(null));
//		Array.get(array, index);
//		int[] dss = new int[2];
//		dss[0]=1;
//		dss[1]=3;
////		dss[2]=4;
		int a1 = 1;
		String a2 = "abd";
		int[] a3 = new int[]{1,2,3};
		Object[] obj = {a1,a2,a3};
		for(Object o:obj){
			System.out.println(o);
		}
		
	}

}
