package dataStructures.arrays;

import java.util.Scanner;

/**
 * @title Left Rotation
 *
 * @author Lukasz Janus
 *
 * @date 10 Sie 2020
 */
public class LeftRotation {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
		
		int[]b = new int[n];
		
		for (int i = 0; i < n; i++) {

			int temp = i+d-n;
			
			if(temp<0) {
				temp+=n;
			}
			//System.out.println(temp);
			b[i]=a[temp];
		}
		
        for (int i = 0; i < n; i++) {
            System.out.print(b[i]+" ");
        }

		scanner.close();
	}
}
