package javass.lang;

import java.lang.Math;

public class Main {

	/**
	 * 1. Intro. to java.
	 * 2. Basic grammar
	 * 3. Conditions &amp; loops statement.
	 * 4. Integrated Develoment Environment &amp; Vim + Maven
	 * 5. Collections
	 */

	public static void main(String[] args) {

		// 1. 人数不确定
		// 2. array - array (name - height)
		// 3. abstract a search function
		//    - 10 种 sort algorithms

		// 1. Variables declaration.
		String[] names;
		int[] heights;
		int amountOfPeople;

		// 2. Input 'amountOfPeople' value from keyboard.
		Scanner keyboardScanner = new Scanner(System.in);
		amountOfPeople = keyboardScanner.nextInt();

		// 3. Initilize array variables.
		names = new String[amountOfPeople];
		heights = new int[amountOfPeople];

		// 4. Input 'names', 'heights' values from keyboard.

		

	}

	private void printHighestPeople(String[] names, int[] highestPosition) {

		// 1. Set highest position to 0.
		int highestPosition = 0;	
		
		// 2. Search the highest position.
		for (int i = 1; i < names.length; ++i) {
			if (heights[highestPosition] < heights[i]) {
				highestPosition = i;
			}	
		}

		// 3. Output the result.
		System.out.println(names[highestPosition] + " is the highest man, and his height is " + heights[highestPosition]);
	}
}
