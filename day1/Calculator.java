package week3.day1;

public class Calculator {
	
	public void add(int a, int b) {
		
		System.out.println(a+b);
		
	}
	
public void add(int a, int b, int c) {
		
		System.out.println(a+b+c);

}
public void mul(double p, int q) {
	
	System.out.println(p*q);

} 
public void mul(double p, int q, double e) {
	
	System.out.println(p*q*e);
}
public static void main(String[] args) {
	
	Calculator cal = new Calculator();
	
	cal.add(4, 5);
	cal.add(5, 8, 9);
	cal.mul(10.4, 8);
	cal.mul(45.5, 6, 12.4);
	
	
}
}