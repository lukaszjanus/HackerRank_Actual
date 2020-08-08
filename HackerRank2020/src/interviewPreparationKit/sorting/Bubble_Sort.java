/**
 * 
 */
package interviewPreparationKit.sorting;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @title Sorting: Bubble Sort
 *
 * @author Lukasz Janus
 *
 * @date 25 lip 2020
 */
public class Bubble_Sort {

	// Complete the countSwaps function below.
	static void countSwaps(int[] a) {

		int n = a.length;
		int count = 0;

		for (int i = 0; i < n; i++) {

			for (int j = i; j < n; j++) {

				if (a[i] > a[j]) {

					// System.out.println(i+" "+a);
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
					count++;
				}

			}

		}

		System.out.println("Array is sorted in " + count + " swaps.");
		System.out.println("First Element: " + a[0]);
		System.out.println("Last Element: " + a[n - 1]);

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		LinkedList<String> spis = new LinkedList<>();

		Pattern compiledPattern = Pattern.compile("[a-z]*@gmail.com");

		for (int NItr = 0; NItr < N; NItr++) {
			String[] firstNameEmailID = scanner.nextLine().split(" ");

			String firstName = firstNameEmailID[0];

			String emailID = firstNameEmailID[1];

			Matcher matcher = compiledPattern.matcher(firstNameEmailID[1]);

			if (matcher.find() == true) {
				spis.add(firstNameEmailID[0]);
			}

		}

		Collections.sort(spis);

		for (int i = 0; i < spis.size(); i++) {

			System.out.println(spis.get(i) + " ");// +spis.getIndex(i).firstNameEmailID[1]);
		}

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] a = new int[n];

		String[] aItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int aItem = Integer.parseInt(aItems[i]);
			a[i] = aItem;
		}

		countSwaps(a);

		scanner.close();
	}
}
