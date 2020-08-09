/**
 * 
 */
package practice.algorithms.greedy;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * @title Marc's Cakewalk
 *
 * @author Lukasz Janus
 *
 * @date 09 Sie 2020
 */
public class MarcsCakewalk {

	// Complete the marcsCakewalk function below.
	static long marcsCakewalk(int[] calorie) {

		Arrays.sort(calorie);
		long temp = 0;
		long power = 0;
		for (int i = calorie.length - 1; i >= 0; i--) {

			temp = (long) (temp + (Math.pow(2, power) * calorie[i]));

			power++;

		}

		return temp;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] calorie = new int[n];

		String[] calorieItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int calorieItem = Integer.parseInt(calorieItems[i]);
			calorie[i] = calorieItem;
		}

		long result = marcsCakewalk(calorie);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
