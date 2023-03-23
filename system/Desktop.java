package org.system;

public class Desktop extends Computer {

	public void desktopSize() {
		
		System.out.println("Let watch desktop");
		
	}	
	
	public static void main(String[] args) {
     
		Computer cmp = new Computer();
		
		cmp.computerModel();
		cmp.computerRam();
		
		Desktop ds = new Desktop();
		
		ds.computerModel();
		ds.computerRam();
		ds.desktopSize();
	}
	
	
}
