 
import java.io.*;

public class FileHandlingDemo1 {
	
	public static void main(String[] args) {
		
	try
	{
	FileInputStream f=new FileInputStream("d:/myfolder/ibm.txt");
	
FileOutputStream fout=new FileOutputStream("d:/myfolder/ibm2.txt");
	
		int n=f.read();
		
		while(n!=-1)
		{
		
		fout.write((char)n);	
		n=f.read();
		}
		
		System.out.println(" file copied");
	}		
	catch(FileNotFoundException e)
	{
			System.out.println(" File is not found in given location");
	}
	catch(IOException e)
	{
			System.out.println(e);
	}
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
