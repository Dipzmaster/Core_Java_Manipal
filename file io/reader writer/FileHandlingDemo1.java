 
import java.io.*;

public class FileHandlingDemo1 {
	
	public static void main(String[] args) {
		
	try
	{
	
FileReader fin=new FileReader("d:/myfolder/ibm.txt");
BufferedReader br=new BufferedReader(fin);


FileWriter fout=new FileWriter("d:/myfolder/ibm4j.txt");
BufferedWriter bw=new BufferedWriter(fout);


String str=br.readLine();
while(str!=null)
{
		bw.write(str);
		bw.write("\n");
		str=br.readLine();
}
		
bw.flush();
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
