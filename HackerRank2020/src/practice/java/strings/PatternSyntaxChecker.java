package practice.java.strings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * @title Pattern Syntax Checker
 *
 * @date 1 paź 2020
 *
 * @author Lukasz Janus
 *
 */
public class PatternSyntaxChecker {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			String pattern = in.nextLine();
			// Write your code

			try {
				Pattern p = Pattern.compile(pattern);
				System.out.println("Valid");
			} catch (PatternSyntaxException e) {
				System.out.println("Invalid");
			}

			testCases--;
			
		}
	}
}