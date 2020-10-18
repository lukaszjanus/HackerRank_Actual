package practice.algorithms.strings;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @title Alternating Characters
 *
 * @date 5 paź 2020
 *
 * @author Lukasz Janus
 *
 */
public class AlternatingCharacters {

	// Complete the alternatingCharacters function below.
	static int alternatingCharacters(String s) {

		int l = s.length()-1;
		int count = 0;
		for (int i = 0; i < l; i++) {
			char temp = s.charAt(i);

			switch (temp) {
			case 'A': {
				if(s.charAt(i+1)=='A') {
					count++;	
				}
				
				break;
			}
			case 'B': {

				if(s.charAt(i+1)=='B') {
					count++;	
				}
				
				break;
			}
			}
		}

		return count;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int qItr = 0; qItr < q; qItr++) {
			String s = scanner.nextLine();

			int result = alternatingCharacters(s);

			bufferedWriter.write(String.valueOf(result));
			bufferedWriter.newLine();
		}

		bufferedWriter.close();

		scanner.close();
	}
}
