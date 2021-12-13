package kg.learning.collections;

import java.io.ByteArrayOutputStream;

public class ByteArrayOutputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByteArrayOutputStream bArrOut = new ByteArrayOutputStream();		 	         
		
		for (int i=0;i<10;i++) {
			bArrOut.write((byte) (Math.random() * 100));
		}
		byte[] byteArray = bArrOut.toByteArray();

		for (byte b : byteArray)
			System.out.print(b+" ");
		
	}
}


