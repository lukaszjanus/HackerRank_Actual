/**
 * 
 */
package practice.algorithms.warmup;

import java.util.Scanner;

/**
 * @title Mini-Max Sum
 *
 * @author Lukasz Janus
 *
 * @date 10 lip 2020
 */
public class MiniMaxSum {
	 // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        
        long[] temp = new long[5];
        long sum = 0;
        for(int i=0;i<5; i++){
            sum+=arr[i];
        }

       for(int i=0;i<5; i++){
            temp[i]=sum-arr[i];
          //  System.out.println(temp[i]);
        }

        long min=temp[0];
        long max=temp[0];
        for(int i=1;i<5; i++){

            if(temp[i]>max){
                max=temp[i];
            }

            if(temp[i]<min){
                min=temp[i];
            }
        }

        System.out.print(min+" "+max);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
