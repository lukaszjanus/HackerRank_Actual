/**
 * 
 */
package practice.algorithms.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Simple Array Sum
 * 
 * @author Lukasz Janus
 * 
 *         Data: 29.06.2020.
 */
public class Simple_Array_Sum {

	/*
	 * Complete the simpleArraySum function below.
	 */
	static int simpleArraySum(int[] ar) {
		int temp = 0;
		for (int i = 0; i < ar.length; i++) {
			temp += ar[i];
		}

		return temp;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int arCount = Integer.parseInt(scanner.nextLine().trim());

		int[] ar = new int[arCount];

		String[] arItems = scanner.nextLine().split(" ");

		for (int arItr = 0; arItr < arCount; arItr++) {
			int arItem = Integer.parseInt(arItems[arItr].trim());
			ar[arItr] = arItem;
		}

		int result = simpleArraySum(ar);
		System.out.println(result);
	}

}
