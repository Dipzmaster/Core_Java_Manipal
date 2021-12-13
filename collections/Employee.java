package kg.learning.collections;

import kg.learning.inher.Person;

public class Employee extends Person implements Comparable {
	int empid;
	String name;
	
	Employee(){
		
	}
	Employee(int empid, String name){
		this.empid = empid;
		this.name = name;
	}
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Object obj) {
		Employee employee = (Employee) obj;
		if(this.empid == employee.empid)
			return 0;
		else if(this.empid > employee.empid)
			return 1;
		else
			return -1;
		
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + "]";
	}
	
	
	

}
