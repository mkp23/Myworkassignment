package org.student;

import org.college.College;

public class Student extends College {

	
	public void studentName() {
		
		System.out.println("Student name is Manish");
		
	}
	
public void studentDept() {
		
		System.out.println("Student dept is CS");
	
	
}
public void studentId() {
	
	System.out.println("Student id is 4560");
}
      public static void main(String[] agrs) {
    	
    	  Student st = new Student();
    	  st.collegeCode();
    	  st.collegeName();
    	  st.collegeRank();
    	  st.studentDept();
    	  st.studentId();
    	  st.studentName();
    	  
      }
}