package week1.day2;

import java.util.Arrays;

public class AnotherArrays {

	public static void main(String[] args) {
		
		String[] subjects = {"English","Maths","Tamil","Science","Social science","Generalknowledge"};
		
		Arrays.sort(subjects);
		
		int len = subjects.length;
		System.out.println(len);
		
		for (int i = len-1; i >=0; i--) {
			
			System.out.println(subjects[i]);

	}

}
}
