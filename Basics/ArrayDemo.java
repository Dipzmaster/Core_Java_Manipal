
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[]{10,20,30,40};
		for(int n : arr){
			n = n + 1;
			System.out.println(n);
		}
		
		int [] num = {1,2,3,5};
		
		String [] names = new String[4];
		names[0] = "Durga";
		names[1] = "Reshma";
		names[2] = "Shiva";
		names[3] = "Ramya";
		
		for(String name : names)
			System.out.println(name);
		
		
		
		int [][] numbers = { 
				{1,2,3},
				{4,5,6},
				{7,8,9}
			};
		
		for(int []n : numbers){
			System.out.println();
			for(int p : n)
				System.out.print(p + " ");
		
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
















