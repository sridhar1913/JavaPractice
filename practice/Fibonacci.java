package practice;

import java.util.Scanner;

/**
 * Fibonacci Series
 * @author spentam
 *
 */
public class Fibonacci {

	public static void main(String[] args) {

		int k, a=1, b=1;
		k=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		while(k<=n) {
			k=a+b;
			if(k>=n)
				break;
			System.out.println(k + " ");
			a=b;
			b=k;
			
		}
		}

}

