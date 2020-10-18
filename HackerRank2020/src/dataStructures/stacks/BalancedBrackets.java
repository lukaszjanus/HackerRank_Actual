package dataStructures.stacks;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

/**
 * @title Balanced Brackets
 * 
 *        - version with collection Stack; version without this collection in
 *        HackerRank exercise "Java Stack" ASCII: (-40 )-41 [-91 ]-93 {-123 }-125
 *        
 * @date 8 paź 2020
 *
 * @author Lukasz Janus
 *
 */
public class BalancedBrackets {

	// Complete the isBalanced function below.
	static String isBalanced(String s) {

		Stack<Integer> stos = new Stack<>();
		char[] brackets = s.toCharArray();

		stos.push((int) brackets[0]);

		for (int i = 1; i < brackets.length; i++) {

			int temp = brackets[i];

			switch (temp) {

			case 40:
			case 91:
			case 123: {
				stos.push(temp);
				break;
			}
			case 41: {
				if (stos.size() > 0) {
					if (stos.peek() == 40) {
						stos.pop();
					} else {
						stos.push(41);
					}
					break;
				}

			}
			case 93: {
				if (stos.size() > 0) {
					if (stos.peek() == 91) {
						stos.pop();
					} else {
						stos.push(temp);
					}
				}
				break;
			}
			case 125: {
				if (stos.size() > 0) {
					if (stos.peek() == 123) {
						stos.pop();
					} else {
						stos.push(temp);
					}
				}
				break;
			}
			}

		}
		if (stos.size() == 0) {
			return "YES";
		} else {
			return "NO";
		}

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		// System.out.println(isBalanced("[]][{]{(({{)[})(}[[))}{}){[{]}{})()[{}]{{]]]){{}){({(}](({[{[{)]{)}}}({[)}}([{{]]({{"));

		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			String s = scanner.nextLine();

			String result = isBalanced(s);

			bufferedWriter.write(result);
			bufferedWriter.newLine();
		}

		bufferedWriter.close();

		scanner.close();
	}
}
