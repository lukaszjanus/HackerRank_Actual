package practice.java.exceptionHandling;

import java.util.Scanner;

/**
 * @title Java Exception Handling
 *
 * @date 11 wrz 2020
 *
 * @author Lukasz Janus
 *
 */

class MyCalculator {

	static int power(int n, int p) throws Exception {
		
		if(n<0 || p<0) {
			throw new Exception("n or p should not be negative.");
		}
		if(n==0 && p==0) {
			throw new Exception("n and p should not be zero.");
		}		
		return (int)(Math.pow(n,p));
	}
}

public class JavaExceptionHandling {

	public static final MyCalculator my_calculator = new MyCalculator();
	public static final Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		while (in.hasNextInt()) {
			int n = in.nextInt();
			int p = in.nextInt();

			try {
				System.out.println(my_calculator.power(n, p));
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}