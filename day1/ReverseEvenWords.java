package week3.day1;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		String test = "I am a software tester";
		           
		              String[] split = test.split(" ");
		              //System.out.println(split.length);
                 
		              for (int i = 0; i < split.length; i++) {
		            	  
		            	  //System.out.println(split[i]); 
		            	  
		            	  if(i%2 == 0) {
		            		 
		            		  System.out.print(" ");
		            		  
		            		  System.out.print(split[i]);
		            		  
		            	  }
						
		            	  else {
		            		  System.out.print(" ");
		            		   char[] charArray = split[i].toCharArray();
		            	  
		            	for (int j = charArray.length-1; j >= 0; j--) {
		            		  
		            		  
		                    System.out.print(charArray[j]);
		            			  
							//System.out.println(split1[j]);
							 
						}
		            	  
					}
		            	  
	} 
		              
		                       
	}      
}
