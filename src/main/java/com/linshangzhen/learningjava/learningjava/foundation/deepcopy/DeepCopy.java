package com.linshangzhen.learningjava.learningjava.foundation.deepcopy;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeepCopy {
	public static void main(String[] args) {
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		
		Point p1 = new Point(100, 100);
		System.out.println("original="+p1);
		
		Point p2 = null;
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		try {
			oos = new ObjectOutputStream(bos);
			oos.writeObject(p1);
			oos.flush();
			
			ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bis);
			p2 = (Point) ois.readObject();
			
			System.out.println("copied:"+p2);
			
			p1.setX(1);
			p1.setY(1);
			
			System.out.println("original="+p1);
			System.out.println("copied="+p2);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				oos.close();
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		}
		byte x = (byte) 128;
		System.out.println(x);
		
	}

}
