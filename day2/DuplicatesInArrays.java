package week1.day2;

public class DuplicatesInArrays {

	public static void main(String[] args) {
		
		
		int A [] = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		int len = A.length;
		
		
		for(int i=0; i<A.length-1; i++) {
			
			for(int j =i+1; j<A.length; j++) {
				
			if(A[i] ==A[j]) {
				
				System.out.println(A[i]);
			}
			}
			
		}
		
		
		
		

	}

}
