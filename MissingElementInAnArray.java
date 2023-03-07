package week1.day2;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		
		
		int A [] = {1,2,3,4,7,6,8};
		
		int len = A.length;
		
		for( int i=A[0]; i<A.length;i++) {
			
			if(i != A[i]) {
				
				System.out.println(i);
			}
			 
		}
		
		

	}

}
