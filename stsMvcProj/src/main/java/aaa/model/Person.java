package aaa.model;

import lombok.Data;

@Data
public class Person {
	
	String pname, gender;
	boolean mil;
	
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String pname, String gender, boolean mil) {
		super();
		this.pname = pname;
		this.gender = gender;
		this.mil = mil;
	}
	
}
