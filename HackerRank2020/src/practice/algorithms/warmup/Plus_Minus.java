package practice.algorithms.warmup;

import java.util.Scanner;

/**
 * Plus Minus
 * 
 * @author Lukasz Janus
 *
 *         Date: 28.06.2020
 */
public class Plus_Minus {

	// Complete the plusMinus function below.
	static void plusMinus(int[] arr) {

		   float a = 0;
	        float b = 0;
	        float c = 0;
	        float s = arr.length;
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] > 0) {
	                a++;
	            } else if (arr[i] < 0) {
	                b++;
	            } else
	                c++;
	        }
	        
	        System.out.println(a/s);
	        System.out.println(b/s);
	        if(c>0.0) System.out.println(c/s);
	        else System.out.println(0.0);
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		plusMinus(arr);

		scanner.close();
	}
}
