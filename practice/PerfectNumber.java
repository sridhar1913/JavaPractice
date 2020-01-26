package practice;

/**
 * Program for the perfect number
 * @author spentam
 *
 */
public class PerfectNumber {

	public static void main(String[] args) {

		//6 = 1+2+3
		int n=28;
		boolean b = isPerfect(n);
		if(b) 
			System.out.println(n + "perfect number");
		else 
			System.out.println(n +"not a perfect number");
	}
		public static boolean isPerfect(int n) {
			int sum=0;
			for(int i=1;i<=n/2;i++) {
				if(n%i==0) 
					sum += i;
			}
				if(n==sum) 
					return true;
		
			return false;
	}
		
}
