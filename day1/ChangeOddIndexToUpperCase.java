package week3.day1;



public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		String test = "changeme";
		 String test1 = test.toUpperCase();
		                char[] charArray = test1.toCharArray();

		               // System.out.println(charArray);
		                
		                for (int i = 0; i < charArray.length; i++) {
							         
		                	          
		                	
		                	if(i%2!=0) {
		                		
	//here i have to ask ,who will conver only odd place to upper case.i have chnage all to upper case and then printed odd places	                	 
		                		
		                	System.out.println(charArray[i]);	
		                	}
		                	
		                	
						}
	}

}
