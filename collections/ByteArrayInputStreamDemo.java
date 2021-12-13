package kg.learning.collections;

import java.io.ByteArrayInputStream;
import java.util.Random;

public class ByteArrayInputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte []buffer = new byte[10];
		Random random = new Random();
		for(int i =0; i<buffer.length; i++){
			buffer[i] = (byte) random.nextInt();
			System.out.print(buffer[i]+" ");
		}
		System.out.println();
		ByteArrayInputStream bis = new ByteArrayInputStream(buffer);
		int data ;
		while((data=bis.read())!=-1){
			System.out.print(data + " ");
		}
		
		
	}

}
