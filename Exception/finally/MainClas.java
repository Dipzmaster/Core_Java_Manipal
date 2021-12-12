class MainClass{
public static void method()throws Exception
{
 try
 {
  System.out.println("hello");
  throw new NullPointerException();
 }
 finally
 {
  System.out.println("java");
 } 
}
 public static void main(String [] args){
  try{
  method();
  }
  catch(Exception e)
  {
   System.out.println("language");
  }
 }}