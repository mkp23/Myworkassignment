package week1.day2;

public class Bicycle {

	public int getCycleNumber() {
		return 5;
		
	}
	
	public String cycleColor(String brand,String color) {
		return brand + " " +color;
	}

	private void getinvocationCount() {
		System.out.println("No");
}
	public static void main(String[] args) {
		//ClassName object = new ClassName();
		Bicycle obj = new Bicycle();
		System.out.println(obj.getCycleNumber());
		System.out.println(obj.cycleColor("CityRider", "Blue"));
		obj.getinvocationCount();
	
	
}
}



