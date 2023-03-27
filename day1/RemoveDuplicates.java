package week3.day1;

import java.util.Iterator;

public class RemoveDuplicates {

	public static void main(String[] args) {
	
		String text = "We learn java basics as part of java sessions in java week1"; int count=0;
		
		        int test = text.length();
		        
		        //System.out.println(test);
		              
		              String [] split = text.split(" ");
		                
		                  //System.out.println(split.length);                 
		                
		                for (int i = 0; i < split.length; i++) {
		   
		                for(int j=i+1; j < split.length; j++ ) 
		                
		                	if(split[i].equals(split[j])) {  
		                        
		                		count++;
		                		
		                		if(count>1) {
		                			
		                		
		                		System.out.println(" ");
		                	}
		                		
		                	else {
		                	
		            System.out.println(split[i]);
		            
		                	}
		            	
		            	
		                }}}}
		                
	
	
		                

