package javass.lang;

import java.util.Scanner;
import java.util.regex.MatchResult;

public class Test {
	
	public static void main(String[] args) {
		String input = "1 fish 2 fish red fish blue fish";	
		// Scanner scanFromString = new Scanner(input).useDelimiter("\\s*fish\\s*");
		// System.out.println(scanFromString.nextInt());
		// System.out.println(scanFromString.nextInt());
		// System.out.println(scanFromString.next().length());
		// System.out.println(scanFromString.next());
		Scanner s = new Scanner(input);
		s.findInLine("(\\d+) fish (\\d+) fish (\\w+) fish (\\w+)");
		MatchResult result = s.match();
		for (int i = 1; i <= result.groupCount(); ++i) {
			System.out.println(result.group(i));
		}
		s.close();
	}
}
