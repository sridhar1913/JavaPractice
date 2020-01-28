package practice;

import java.util.HashMap;
import java.util.Map;

/**
 * To count number of chars and strings in a sentence
 * 
 * @author spentam
 *
 */
public class MapExampleCountOccurances {
	String str = "Hi welcome to the world of java for the collections interface map.";

	public static void main(String[] args) {

		MapExampleCountOccurances mapExampleCountOccurances = new MapExampleCountOccurances();
		mapExampleCountOccurances.countCharecters();
		mapExampleCountOccurances.countWords();

	}

	/**
	 * countCharecters() to count the occurances of each character in a sentence
	 */
	void countCharecters() {

		Map<Character, Integer> countCharOccurances = new HashMap<>();
		char[] characters = str.toCharArray();

		for (Character character : characters) {
			// fetching the character
			Integer number = countCharOccurances.get(character);
			if (number == null) {
				countCharOccurances.put(character, 1);
			} else {
				countCharOccurances.put(character, number + 1);
			}
		}
		System.out.println("The list of each charecter occurance count: " + countCharOccurances);
	}

	/**
	 * countWords() to count the occurances of word.
	 */
	void countWords() {
		Map<String, Integer> countWordOccurance = new HashMap<>();
		String[] words = str.split(" ");
		for (String word : words) {
			Integer number = countWordOccurance.get(word);
			if (number == null) {
				countWordOccurance.put(word, 1);
			} else {
				countWordOccurance.put(word, number + 1);
			}
		}
		System.out.println("The list of each word occurance count: " + countWordOccurance);
	}
}
