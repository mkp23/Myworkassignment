package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		
		int i; int n=17;
		
		
		for(i=2;i<=n-1;i++) {
			
			
			if(i/n==0) {
				System.out.println("a prime number");
				break;
			}
			else {
				
				System.out.println("not a prime number");
			}
		}
		

	}

}
