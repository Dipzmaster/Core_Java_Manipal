
public class BreakContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i<5; i++){
			System.out.println();
			for(int j = 0; j<4; j++){
				if(j==2)
					continue;
				System.out.print(" " + j + " ");
			}
		}	
	}

}
