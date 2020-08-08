/**
 * 
 */
package practice.algorithms.strings;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @title Mars Exploration
 *
 * @author Lukasz Janus
 *
 * @date 27 lip 2020
 */
public class MarsExploration {

	// Complete the marsExploration function below.
	static int marsExploration(String s) {

		int temp = 0;

		char ss = 'S';
		char o = 'O';
		for (int i = 0; i < s.length(); i += 3) {

			if (s.charAt(i) != ss) {
				temp++;
			}
			if (s.charAt(i + 1) != o) {
				temp++;
			}
			if (s.charAt(i + 2) != ss) {
				temp++;
			}
		}
		return temp;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scanner.nextLine();

		int result = marsExploration(s);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
