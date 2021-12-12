import java.util.*;

     class MyClass <E> {
         E var;
    	 
         public void setVar(E var)
         {
        	 this.var=var;
         }
         public E getVar()
         {
        	 return var;
         }     
         
         public void show()
         {
        	 System.out.println(var);
         }
    	 
    }
     
     
     
    public class Test5 {
        public static void main(String args[]) {
        MyClass<Integer> m=new MyClass<Integer>();
        m.setVar(10);
        System.out.println(m.getVar());
        
        MyClass<String> m1=new MyClass<String>();
        m1.setVar("IBM");
        System.out.println(m1.getVar());
        }
    }