/**
 * 
 */
package practice.algorithms.strings;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @title HackerRank in a String!
 *
 * @author Lukasz Janus
 *
 * @date 14 lip 2020
 */
public class HackerRankinaString {

	// Complete the hackerrankInString function below.
	static String hackerrankInString(String s) {
		String test = "hackerrank";
		String sec_test = "";
		int sec = 0;

		for (int i = 0; i < test.length(); i++) {
			for (int j = sec; j < s.length(); j++) {
				// System.out.print(j+" ");
				// System.out.println(test.charAt(i) +" "+ s.charAt(j));
				//System.out.println(i + " " + j);
				if (s.charAt(j) == (test.charAt(i))) {
					// System.out.println(test.charAt(i) +" "+ s.charAt(j));
					sec = j + 1;
					sec_test = sec_test + s.charAt(j);

					break;
				}
			}
		}

		if (sec_test.equals(test)) {
			return "YES";
		}
		return "NO";
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int qItr = 0; qItr < q; qItr++) {
			String s = scanner.nextLine();

			String result = hackerrankInString(s);

			bufferedWriter.write(result);
			bufferedWriter.newLine();
		}

		bufferedWriter.close();

		scanner.close();
	}
}
