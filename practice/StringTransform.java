package practice;

import java.util.Scanner;

/**
 * Transforming the String
 *
 */
public class StringTransform {

	public static void main(String[] args) {
		//text = Hello_Welcome_To_The_World
		String text = null;
		StringBuffer output = new StringBuffer();
		System.out.println("Enter the sentence to transform :: ");
		Scanner scanner = new Scanner(System.in);
		text = scanner.nextLine();
		
		//boolean variable to know whether the current char is the firstletter of word or not
		boolean firstLetter = true;
		
		for(int i=0; i<text.length(); i++) {
			char temp = text.charAt(i);
			if(temp=='_') {
				output.append(" ");
				// if the current char is '_' the append with a space to the output and then set
				// first letter to true to indicate that the next char is the first letter of
				// the word.
				firstLetter=true;
			} else {
				if(firstLetter) {
					//if the firstletter is set to true then we append the charecter as it is and we set the firstletter 
					//variable to false, we know that the next letter is not the first letter of the word
					output.append(temp);
					firstLetter = false;
				} else {
					//if the current letter is not the first letter then we convert it to lower case and then append it to the output variable
					output.append(Character.toLowerCase(temp));
				}
			}
			
		}
		System.out.println("Output :: "+output);
	}
}
