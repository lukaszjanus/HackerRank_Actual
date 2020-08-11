package practice.algorithms.implementation;

import java.io.*;
import java.util.*;

/**
 * @title Climbing the Leaderboard
 *
 * @author Lukasz Janus
 *
 * @date 10 sie 2020
 */
public class ClimbingTheLeaderboard {

	// Complete the climbingLeaderboard function below.
	static int[] climbingLeaderboard(int[] scores, int[] alice) {
		
		
		/*	
		 //first version:
		  
		int al = alice.length;
		int[] result = new int[al];
		
		int[] set = java.util.stream.IntStream.of(scores).distinct().toArray();
		int l =set.length-1;
		
		
		for (int j = 0; j < al; j++) {
			int count = set.length + 1;

			for (int i=l;i>=0; i--) {
				System.out.println(set[i] +" "+ alice[j]);
				if (set[i] > alice[j]) {
					System.out.println(count);
					result[j] = count;
					break;
				}
				count--;
				result[j] = count;
			}
		}
		
		*/

		int[] result = new int[alice.length];

		int[] array = java.util.stream.IntStream.of(scores).distinct().toArray();
		int i = array.length - 1;

		int j = 0;

		for (int score : alice) {
			while (i >= 0) {
				if (score >= array[i])
					i--;
				else {
					result[j] = i + 2;
					break;
				}
			}
			if (i < 0) {
				result[j] = 1;
			}
			j++;
		}

		return result;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int scoresCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] scores = new int[scoresCount];

		String[] scoresItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < scoresCount; i++) {
			int scoresItem = Integer.parseInt(scoresItems[i]);
			scores[i] = scoresItem;
		}

		int aliceCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] alice = new int[aliceCount];

		String[] aliceItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < aliceCount; i++) {
			int aliceItem = Integer.parseInt(aliceItems[i]);
			alice[i] = aliceItem;
		}

		int[] result = climbingLeaderboard(scores, alice);

		for (int i = 0; i < result.length; i++) {
			bufferedWriter.write(String.valueOf(result[i]));

			if (i != result.length - 1) {
				bufferedWriter.write("\n");
			}
		}

		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
