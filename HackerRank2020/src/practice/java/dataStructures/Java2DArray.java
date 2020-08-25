package practice.java.dataStructures;

import java.util.Scanner;

/**
 * 
 * @title Java 2D Array
 *
 * @date 24 sie 2020
 *
 * @author Lukasz Janus
 *
 */
public class Java2DArray {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] arr = new int[6][6];

		for (int i = 0; i < 6; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}

		scanner.close();

		int sum = Integer.MIN_VALUE;

		int n = 5;

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 4; j++) {

				int temp = arr[i + 1][j + 1];

				for (int k = j; k < j + n; k++) {
					temp += arr[i][k];
				}

				for (int k = j; k < j + n; k++) {
					temp += arr[i + 2][k];
				}

				if (temp > sum) {
					sum = temp;
				}
			}
		}

		System.out.println(sum);
	}
}
