package week1.day2;

public class FindDuplicates {

	public static void main(String[] args) {
		
		int[] number = {2,5,7,7,5,9,2,3};
		
		for(int i=0;i<number.length-1; i++) {
			
			for(int j=0;j<i; j++)
			{
				if(number[i] == number[j]) {
					System.out.println(number[i]);
				}
			}
			
			
			
		}
		
		
		

	}

}
