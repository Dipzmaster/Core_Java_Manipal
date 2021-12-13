
public class TypeCastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b = 10;
		int i = b; // implicit typecasting - widening
		
		byte b1 = (byte)i; // explicit typecasting - narrowing 
		
		System.out.println(b1 + " :: " + i);
		
		float f = i;
		int ii =(int) f;
		
		byte c = 125;
		
		byte d = (byte) (b * c);
		
	}

}
