package javass.lang;

import java.util.Scanner;

public class Main {
	
		/**
		 * In main() method, I will try:
		 * 0. OpenJDK (JVM, javac, java, javadoc.
		 * 1. Variables, data types, basic operators, input
		 * &amp;scanner, conditions (if, else, else if), nested
		 * statements, loops (for, while, do while).
		 * 2. Collections: arrays, sets, lists, map, hashmap.
		 * 3. Oriented-Object: abstraction (creating classes, inner
		 * classes), inheritance (overloading methods, interface),
		 * enums, polymorphism.
		 */
	public static void main(String[] args) {

		// personal info.
		byte age = 25;	// -128 ~ 127
		// NOTECIE: the range
		short postcode = 18100;	// -32768 ~ 32767
		int salary = 20000;	// -2.1b ~ 2.1b
		long debit = 1000000000;	// -9.2bb ~ 9.2bb

		boolean is_male = true;

		char group = 'A';
		char group_in_number = 65;
		char group_in_hexadecimal = 0x41;

		String name = "forrest lyu";

		System.out.println("name\tage\tpostcode\tsalary\tdebit\tis male\tgroup");
		System.out.println(name + "	" + age + "	" + postcode + "	" + salary + "	" + debit + "	" + is_male + "		" + group);

		// Input cash, birthday, s_have_estate, loved_letter, information,  
		Scanner my_scanner = new Scanner(System.in);	

		System.out.println("Input your extra information:");
		System.out.println("cash\tbirthday\tis have estate\tinformation");

		int cash = my_scanner.nextInt();
		long birthday = my_scanner.nextLong();
		boolean is_have_estate = my_scanner.nextBoolean();
		// to be fixed ...
		char[] loved_letter = my_scanner.next().toCharArray();

		// to be fixed ...
		// how to delete the \lf
		// use space key
		String information = my_scanner.next();

		System.out.println("cash\tbirthday\tis have estate\tloved letter\tinformation");
		System.out.println (cash + "	" + birthday + "	" + is_have_estate + "	" + loved_letter[0] + "	" + information);

		// Test if this man is a wealthy man.
		if (cash > 15000 && birthday < 19951105) {
			System.out.println("You are a wealthy man!");
		} else if (cash > 15000 && birthday >= 19951105 ) {
			System.out.println("You will be a wealthy man!");
		} else {
			System.out.println("You are a loser.");
		}

		// loops
		while (cash > 15000) {
			System.out.println(" You have cash " + cash + ", and just relax");
			cash -= 1000;
		}

		// condition: cash <= 15000
		do {
			System.out.println(" You have cash " + cash + ", shit yourself, and get your ass off.");
			cash += 1000;
			
		} while (cash <= 30000);	// need semicolon.

		// condition: cash <=100000
		for ( ; cash <= 100000; cash += 1000) {
			System.out.println(" You have cash  " + cash + ", go on to 100000.");
		}

		// 2. Collections: arrays, sets, lists, map, hashmap.         
		// Oriented-object: abstraction (creating classes, inner
		// classes), inheritance (overloading methods, interface),
		// enums, polymorphism.
	}
}
