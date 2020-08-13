package practice.java.introduction;


/**
 * @title Java Loops I
 *
 * @author Lukasz Janus
 *
 * @date 12 Sie 2020
 */
import java.util.Scanner;

public class JavaLoopsI {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 1; i < 11; i++) {
			System.out.println(N + " x " + i + " = " + N * i);
		}

		scanner.close();
	}
}
