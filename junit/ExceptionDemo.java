package mait.java.demo.junit.exception;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class ExceptionDemo {

   String message = "Shyam";	
   MessageUtil messageUtil = new MessageUtil(message);
   
   @Test(expected = ArithmeticException.class)
   public void testPrintMessage() {	
      System.out.println("Inside testPrintMessage()");     
      messageUtil.printMessage();     
   }

   @Test
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi!" + "Shyam";
      assertEquals(message,messageUtil.salutationMessage());
   }
}