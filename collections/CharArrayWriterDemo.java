package kg.learning.collections;

import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharArrayWriter charArrayWriter = null;
		String data = "Welcome to Java World";
		try {
			charArrayWriter = new CharArrayWriter();
			charArrayWriter.write(data);
			char [] chars = charArrayWriter.toCharArray();
			
			for(char c : chars){
				System.out.print(c);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
