package practice.java.introduction;

import java.util.Scanner;

/**
 * @title Java Strings Introduction
 *
 * @author Lukasz Janus
 *
 * @date 12 Sie 2020
 */
public class JavaStringsIntroduction {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		System.out.println(A.length() + B.length());

		if (A.compareTo(B) > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		String tempA = String.valueOf(A.charAt(0));
		String tempB = String.valueOf(B.charAt(0));
		A = tempA.toUpperCase() + A.substring(1);
		B = tempB.toUpperCase() + B.substring(1);
		System.out.println(A + " " + B);
	}
}
