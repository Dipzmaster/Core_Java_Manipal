package kg.learning.collections;

public class TestDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test<Employee> test = new Test<Employee>();
		test.setData(new Employee());
		System.out.println(test.getData());
	
		
		Manager manager = new Manager();
		
		Test<Manager> test1 = new Test<Manager>();
		test1.setData(manager);
		System.out.println(test1.getData());
		
		
		Rest<String, Integer> rest = new Rest<String, Integer>();
		
		rest.setFirst("Ram");
		rest.setSecond(433);
		
		
	}

}
