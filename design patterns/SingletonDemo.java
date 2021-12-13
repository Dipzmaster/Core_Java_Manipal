package com.kg.dp;

class SingleObject {
	   //create an object of SingleObject
	   private static SingleObject instance = new SingleObject();
	   
	   //make the constructor private so that this class cannot be instantiated
	   private SingleObject(){}

	   //Get the only object available
	   public static synchronized SingleObject getInstance(){
		   	return instance;
	   }

	   public void showMessage(){
	      System.out.println("Hello World!");
	   }
	   
	   public Object clone() throws CloneNotSupportedException{
		return new CloneNotSupportedException();
		   
	   }
	}

	public class SingletonDemo {
		public static void main(String[] args) {
			//SingleObject obj = new SingleObject(); // will not be able to create object due to private constructor
			
			
			 SingleObject object = SingleObject.getInstance();
		      //show the message
		      object.showMessage();
		      
		      SingleObject object1 = SingleObject.getInstance();
		      object1.showMessage();
		      
		      if(object.equals(object1))
		    	  System.out.println("equal");
		      
		      if(object == object1)
		    	  System.out.println("equal");

		      

		}
	}
