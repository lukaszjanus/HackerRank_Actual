package practice.java.dataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @title Java Stack
 *
 * @date 28 sie 2020
 *
 * @author Lukasz Janus
 *
 */
public class JavaStack {

	public static String check(String test) {

		List<Character> rev = new ArrayList<>();

		rev.add(test.charAt(0));

		for (int i = 1; i < test.length(); i++) {

			char temp = test.charAt(i);

			System.out.println(i + " " + temp + " " + rev.toString());

			switch (temp) {

			case '(': {
				rev.add(temp);
				break;
			}
			case '{': {
				rev.add(temp);
				break;
			}

			case '[': {
				rev.add(temp);
				break;
			}

			case '}': {

				if (rev.size() > 0 && rev.get(rev.size() - 1) == '{') {
					rev.remove(rev.size() - 1);
				} else
					return "false";
				break;
			}

			case ')': {
				if (rev.size() > 0 && rev.get(rev.size() - 1) == '(') {
					rev.remove(rev.size() - 1);
				} else
					return "false";
				break;
			}

			case ']': {
				if (rev.size() > 0 && rev.get(rev.size() - 1) == '[') {
					rev.remove(rev.size() - 1);
				} else
					return "false";
				break;
			}

			}

		}

		if (rev.isEmpty()) {
			return "true";
		} else
			return "false";

	}

	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);
		/*
		 * while (sc.hasNext()) { String input = sc.next();
		 * System.out.println(check(input)); }
		 */

		System.out.println(check("[]"));
	}

}
