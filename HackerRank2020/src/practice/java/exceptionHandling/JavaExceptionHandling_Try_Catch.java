package practice.java.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @title Java Exception Handling (Try-catch)
 *
 * @date 9 wrz 2020
 *
 * @author Lukasz Janus
 *
 */
public class JavaExceptionHandling_Try_Catch {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		try {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a / b);
		} catch (InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}
}