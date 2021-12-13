package kg.learning.collections;

import java.util.Vector;

public class VectorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector fruitBasket = new Vector(4,3);
		System.out.println("Size : " + fruitBasket.size() + "\nCapacity : " + fruitBasket.capacity());
		
		fruitBasket.addElement("Banana");
		fruitBasket.addElement("Mango");
		fruitBasket.addElement("Pear");
		fruitBasket.addElement("Banana");
		
		
		fruitBasket.addElement("Mango");
		fruitBasket.addElement("Pear");
		fruitBasket.addElement("Banana");
		fruitBasket.addElement("Mango");
		
		fruitBasket.addElement("Pear");
		fruitBasket.addElement("Banana");
		
		fruitBasket.addElement("Mango");
		fruitBasket.addElement("Pear");
		System.out.println("Size : " + fruitBasket.size() + "\nCapacity : " + fruitBasket.capacity());

		
		
		
	}

}
