package week3.day1;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Amazon";
		
		char[] ch= str.toCharArray();
		
		for(int i=ch.length-1;i>=0; i--) {
			
			System.out.println(ch[i]);
		}
			
		
		
		
	}
}
