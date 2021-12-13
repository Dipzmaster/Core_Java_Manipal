
public class Demo {
	private int num = 100;
	private String message;
	static int count = 0;
	Demo(){
		this("Hi");
		System.out.println("I am default constructor");
		count++;
	}
	Demo(int num){
		this();
		System.out.println("I am parametrized constructor");

		this.num = num;
	}
	
	Demo(String message){
		System.out.println("I am parametrized:String constructor");

		this.message = message;
	}
	
	
	
	public int getNum() {
		return num;
	}
	/*public void setNum(int num) {
		this.num = num;
	}*/
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void showDetails(){
		System.out.println(num + " \t" + message + "\t" + count);
	}

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo demo = new Demo();
		demo.num = 10;
		demo.message = "Java is magic";		
		
		Demo demo1 = new Demo(200);
		demo.showDetails();

		demo1.showDetails();
		
		Demo demo2 = new Demo("Java is Music");
		demo2.showDetails();
		//Demo.num = 11; // incorrect
		
				//System.out.println(demo.num + "\t" + demo.message + "\t" + count);
				
	}*/

}
