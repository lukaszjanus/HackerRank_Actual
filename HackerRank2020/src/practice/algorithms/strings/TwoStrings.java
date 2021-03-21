package practice.algorithms.strings;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @title Two Strings
 *
 * @date 21 mar 2021
 *
 * @author Lukasz Janus
 *
 */
public class TwoStrings {
	// Complete the twoStrings function below.

	/**
	 * Worked version with delete duplicates.
	 * 
	 * @param s1
	 * @param s2
	 * @return "YES" or "TRUE"
	 */
	static String twoStrings(String s1, String s2) {

		int l = s1.length();
		int l2 = s2.length();
		String result = "NO";

		Set<Character> st1 = new HashSet<>();
		Set<Character> st2 = new HashSet<>();

		for (int i = 0; i < l; i++) {
			char t1 = s1.charAt(i);
			st1.add(t1);
		}

		for (int j = 0; j < l2; j++) {

			char t2 = s2.charAt(j);
			st2.add(t2);
		}

		for (char temp : st1) {

			for (char temp2 : st2) {
				if (temp == temp2) {
					result = "YES";
					break;
				}

			}
		}

		return result;
	}

	/**
	 * Standard 'brutal force' - correct, but works to long :)
	 * 
	 * @param s1
	 * @param s2
	 * @return "YES" or "TRUE"
	 */
	static String twoStrings2(String s1, String s2) {

		int l = s1.length();
		int l2 = s2.length();
		String result = "NO";

		for (int i = 0; i < l; i++) {
			char t1 = s1.charAt(i);
			for (int j = 0; j < l2; j++) {

				char t2 = s2.charAt(j);
				if (t1 == t2) {
					result = "YES";
					break;
				}
			}
		}
		return result;
	}

	
	
	// Original Hacker Rank entry point 
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
