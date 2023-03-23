package org.department;

import org.student.Student;

public class Department extends Student{

	
	public void deptName() {
		
		System.out.println("MY department was ECE");
		
		
		
	}
	
	public static void main(String[] args) {
		
		Department dpt = new Department();
		
		dpt.collegeCode();
		dpt.collegeName();
		dpt.collegeRank();
		dpt.deptName();
		dpt.studentDept();
		dpt.studentName();
		dpt.studentId();
		
	}
	
}

