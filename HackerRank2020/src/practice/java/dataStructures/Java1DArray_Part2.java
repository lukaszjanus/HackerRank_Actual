package practice.java.dataStructures;

import java.util.Scanner;

/**
 * @title Java 1D Array (Part 2):
 * 
 *  - recursion ok
 *  - 'for' loop -> pass only 50% tests
 *
 * @date 27 sie 2020
 *
 * @author Lukasz Janus
 *
 */
public class Java1DArray_Part2 {

	public static boolean canWin(int leap, int[] arr) {

		return check(leap, arr, 0, "start ");
	}

	public static boolean check(int leap, int[] arr, int i, String show) {

		if (i >= arr.length)
			return true; // win
		if (i < 0 || arr[i] == 1)
			return false; // i-- or arr[i] = 1 (can't move more)
		System.out.println(show);
		arr[i] = 1; // visited

		return check(leap, arr, i + leap, "i+leap " + i) || // first move condition
				check(leap, arr, i + 1, "i+1 " + i) || // second move condition
				check(leap, arr, i - 1, "i-1 " + i); // thirt move condition
	}

	/*
	 * //pass only 50% tests public static boolean canWin(int leap, int[] arr) {
	 * 
	 * int i = 0;
	 * 
	 * int[] index = new int[arr.length];
	 * 
	 * if(arr[0]==1){ return false; }
	 * 
	 * // System.out.println("start"); for (;;) {
	 * 
	 * //System.out.println(i + " " + arr[i] + " index: " + index[i]); if (index[i]
	 * == 1) { return false; } index[i] = 1;
	 * 
	 * if (i == arr.length - 1 || i + leap >= arr.length) { return true; }
	 * 
	 * if (i + leap < arr.length && arr[i + leap] == 0 && index[i+leap]==0) { i +=
	 * leap; } else if (arr[i + 1] == 0 && index[i+1]==0) { i++; } else if (i - 1 >=
	 * 0 && arr[i - 1] == 0 && index[i-1]==0) { i--; }
	 * 
	 * } }
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// int q = scan.nextInt();
		int q = 1;
		while (q-- > 0) {
			int n = 36;
			int leap = 8;
			int[] game = { 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
			// int[] game = { 0, 1, 0 };
			/*
			 * int[] game = { 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 1,
			 * 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0,
			 * 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0,
			 * 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1 };
			 */
			System.out.println((canWin(leap, game)) ? "YES" : "NO");
		}

		/*
		 * Scanner scan = new Scanner(System.in); int q = scan.nextInt(); while (q-- >
		 * 0) { int n = scan.nextInt(); int leap = scan.nextInt();
		 * 
		 * int[] game = new int[n]; for (int i = 0; i < n; i++) { game[i] =
		 * scan.nextInt(); }
		 * 
		 * System.out.println( (canWin(leap, game)) ? "YES" : "NO" ); } scan.close();
		 */

	}
}
