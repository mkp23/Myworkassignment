package week3.day1;

public class Palindrome {

	public static void main(String[] args) {
		
		
		String pr = "maDam";
		String rev = "";
        
		             char[] charArray = pr.toCharArray();
		             
		for (int i=charArray.length-1; i >=0; i--) {
			
			//System.out.println(charArray[i]);
			
			
			rev=rev+charArray[i];
		}
			if(pr.equalsIgnoreCase(rev)) {  //for Upper or Lower cases Ignorance
				
				System.out.println("It is a polindrome ");
			}
			else {
				System.out.println("It is not a polindrome ");
			}
		}
	}


