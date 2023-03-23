package org.student;

public class AxisBank extends BankInfo {

	
	public void deposit() {
		
		System.out.println("Max deposite amont will be 5000");
	}
	
	//THIS IS CASE OF OVERRIDDING AS IT IS PRINTING AxisBank deposite
	
	public static void main(String[] args) {
		
		AxisBank AB = new AxisBank();
		
		AB.deposit();
		AB.saving();
		AB.fixed();
		
		
	}
	

	}


