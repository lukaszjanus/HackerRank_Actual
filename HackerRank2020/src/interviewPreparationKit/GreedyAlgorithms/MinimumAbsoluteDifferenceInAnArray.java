package interviewPreparationKit.GreedyAlgorithms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @title Minimum Absolute Difference in an Array
 *
 * @date 18 sie 2020
 *
 * @author Lukasz Janus
 *
 */
public class MinimumAbsoluteDifferenceInAnArray {

	// Complete the minimumAbsoluteDifference function below.
	static int minimumAbsoluteDifference(int[] arr) {

		int sum = Integer.MAX_VALUE;

		List<Integer> list = new ArrayList<Integer>();
	

		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		
		Collections.sort(list);
		for(int i=0;i<list.size()-1;i++) {
			int temp = Math.abs(list.get(i)-list.get(i+1));
			if(sum>temp)sum=temp;
		}
		
		return sum;
	}


	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];
    	//	int[] arr = { -59, -36, -13, 1, -53, -92, -2, -96, -54, 75 }; //result: 1
        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = minimumAbsoluteDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}