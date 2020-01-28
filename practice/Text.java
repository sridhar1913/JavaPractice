package practice;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Text {

	public BigDecimal getAvgMarks() {
		int sum = 353;
		int number = 3;
		
		//using BigDecimal divide method and getting up 3 precision values rounding to up
		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
	}
	
	public static void main(String[] args) {

		int[] marks = new int[6];
		Arrays.fill(marks, 1);
		System.out.println(Arrays.toString(marks));
		
		int[] marks2 = {1,2,3};
		System.out.println(Arrays.toString(marks2));
		
		int[] marks3 = {1,2,3};
		//enhanced for loop 
		for(int mark:marks3) {
			System.out.println("marks3: "+mark);
		}
		System.out.println(Arrays.equals(marks2, marks3));
		
		int[] marks4 = {20,1,561,2,5};
		Arrays.sort(marks4);
		System.out.println(Arrays.toString(marks4));
		
		Text t = new Text();
		System.out.println("avg: "+t.getAvgMarks());
	}
	
}
