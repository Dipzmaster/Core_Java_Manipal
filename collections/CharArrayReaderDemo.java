package kg.learning.collections;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] chars = {'J','A','V','A'};

		CharArrayReader charArrayReader = new CharArrayReader(chars);
		try{
		int data = 0;
		while((data = charArrayReader.read()) != -1) {
		  System.out.println((char)data);
		}
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		charArrayReader.close();
	}

}
