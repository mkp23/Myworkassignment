package week1.day2;

import java.util.Arrays;

public class LinearArrays {

	public static void main(String[] args) {
		
		int[] scores = {89,98,80,78,92};
		
		//Arrays.sort(scores);  --> output not showing
		
		int len = scores.length;
		
		System.out.println("The length of this array is :"+ len);

		
		for (int i = 0; i < len; i++)
			System.out.println(scores[i]);
		
	}

}
