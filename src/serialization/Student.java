package serialization;

import java.io.Serializable;

public class Student implements Serializable{

	int id;
	String name;
	String grade;
//	transient makes field empty if serialized
	transient String ssn;
	
	public Student(int id, String name, String grade, String ssn) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.ssn = ssn;
	}
	
	
}
