package practice;

import java.util.Arrays;
import java.util.Scanner;

public class VariableArguments {
	
	//variable arguments for defining array size dynamically and add the values dynamically without passing new int[]
	//... will have the list
	public int sum(int... values) {
		int add = 0;
		for(int value:values) {
			add += value;
			System.out.println("add2: "+ add);
		}
		return add;
	}
	
	public static void main(String[] args) {
		VariableArguments va = new VariableArguments();
//		int sum = va.sum(new int[]{1,2,1,4});
		int sum = va.sum(1,2,1,4,5);
		System.out.println(sum);
	}

}
