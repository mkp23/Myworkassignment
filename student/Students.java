package org.student;

public class Students {

	

	public void getStudentInf(int id) {
		
	System.out.println("5647");
		
	}
	
	public void getStudentInfo(int id, String name) {
		
		System.out.println(" Id is 5647 and name is Manish");
}

public void getStudentInfo(String emaiid , int mobn) {
		
		System.out.println("My emai id is pandey@gmail.com and mobile number 8013456782");
}

public static void main(String[] args) {
	
	Students st = new Students();
	
	st.getStudentInf(66);
	st.getStudentInfo(4506, "manish");
	st.getStudentInfo("pandeym.349@gmai.com", 801233045);
}
}
