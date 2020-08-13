package practice.java.strings;

import java.util.Scanner;

/**
 * @title Java Substring
 *
 * @date 13 sie 2020
 *
 * @author Lukasz Janus
 *
 */
public class JavaSubstring {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		int start = in.nextInt();
		int end = in.nextInt();

		System.out.println(S.substring(start, end));

	}
}
