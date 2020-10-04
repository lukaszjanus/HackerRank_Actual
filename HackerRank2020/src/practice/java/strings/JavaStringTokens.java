package practice.java.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @title Java String Tokens
 *
 * @date 1 paź 2020
 *
 * @author Lukasz Janus
 *
 */
public class JavaStringTokens {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		//test no 2:
		// String s = "Its always better if you find edge cases by yourself rather than
		// buying test cases with valuable hackos!! May be this case won't help you to
		// find the buuuuuug ";

		// Write your code here.

		s = s.replaceAll("[,.;:'\"!@#$%^&*()?]", " ");
		// s = s.replace(" ", " "); two spacies to one space -> error in 7 tests

		String[] t = s.split(" ");
		List<String> r = new ArrayList<>();

		for (int i = 0; i < t.length; i++) {
			if (t[i].length() > 0) {
				r.add(t[i]);
			}
		}

		System.out.println(r.size());
		for (int i = 0; i < r.size(); i++) {
			System.out.println(r.get(i));
		}

	}
}
