package ctci.canessa;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	/*
	 * This time without additional data structure(s).
	 */
	static boolean isUnique2(String str) {
		
		// **** check for short strings ****
		if (str.length() <= 1)
			return true;
		
		// **** traverse the string looking for duplicate characters ****
		for (int i = 0; i < (str.length() - 1); i++) {
			
			// **** ****
			char currentChar = str.charAt(i);
	
			// **** look for this character in the remaining string ****
			int index = str.substring(i + 1).indexOf(currentChar);
						
			// **** check if we found the caracter in the substring ****
			if (index != -1)
				return false;
		}
		
		// **** the string has unique characters ****
		return true;
	}
	
	
	/*
	 * Determine if string contains unique characters.
	 */
	static boolean isUnique(String str) {
		
		// **** check for short strings ****
		if (str.length() <= 1)
			return true;
		
		// **** instantiate a character array from the string ****
		char[] charArray = str.toCharArray();
		
		// **** sort the character array ****
		Arrays.sort(charArray);
		
		
//		// **** build a sorted string from the sorted character array ****
//		str = new String(charArray);
//			
//		// **** traverse string looking for duplicate characters ****
//		char lastChar = str.charAt(0);
//		for (int i = 1; i < str.length(); i++ ) {
//			
//			// **** check if this character matches the last one ****
//			if (str.charAt(i) == lastChar)
//				return false;
//
//			// **** this is now the last character ****
//			lastChar = str.charAt(i);
//		}

		
		// **** traverse the sorted character array looking for duplicates ****
		for (int i = 1; i < charArray.length; i++) {
			
			// **** check if this character matches the previous one ****
			if (charArray[i - 1] == charArray[i])
				return false;
		}
		
		// **** the string has unique characters ****
		return true;
	}
	
	
	/*
	 * Test scaffolding
	 */
	public static void main(String[] args) {

		// **** open a scanner ****
		Scanner sc = new Scanner(System.in);
		
		// **** prompt for string ****
		System.out.print(">>> str: ");
		
		// **** read the string ****
		String str = sc.nextLine();

		// **** check if the string is unique ****
		System.out.println("main <<< str ==>" + str + "<== unique: " + isUnique(str));
		
		// **** check if the string is unique ****
		System.out.println("main <<< str ==>" + str + "<== unique: " + isUnique2(str));
		
		// **** close the scanner ****
		sc.close();
	}

}
