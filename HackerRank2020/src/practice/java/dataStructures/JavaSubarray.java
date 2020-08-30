package practice.java.dataStructures;

import java.util.Scanner;

/**
 * @title Java Subarray
 *
 * @date 25 sie 2020
 *
 * @author Lukasz Janus
 *
 */
public class JavaSubarray {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		/*
		 * int n = scan.nextInt(); int[] a = new int[n]; for (int i = 0; i < a.length;
		 * i++) {a[i]=scan.nextInt();}
		 */
		scan.close();

		int[] a = { -463, -744, -589, -405, -321, -427, -164, -581, -613, -468, -246, -685, -869, -966, -889, -217,
				-712, -888, -251, -859, -969, -582, -603, -658, -49, -973, -185, -241, -439, -511, -479, -902, -255,
				-420, -660, -576, -848, -824, -157, -461, -644, -404, -498, -513, -722, -387, -82, -434, -275, -686,
				-645, -597, -268, -248, -255, -669, -573, -792, -910, -364, -303, -742, -267, -910, -162, -279, -487,
				-362, -103, -644, -823, -747, -400, -674, -612, -474, -61, -46, -260, -689, -732, -905, -286, -353,
				-505, -893, -22, -78, -37, -285, -443, -341, -27, -62, -603, -541, -341, -90, -904, -796 };
		int n = a.length;
		// result test case4: 5050

		int count = 0;
		int sum = Integer.MIN_VALUE;

		for (int i = 0; i < n - 1; i++) {

			// System.out.print(a[i]);
			// System.out.print(i);
			sum = a[i];

			if (sum < 0)
				count++;

			for (int j = i + 1; j < n; j++) {
				// System.out.print(" "+a[j]);
				// System.out.print(" "+j);
				sum += a[j];
				if (sum < 0)
					count++;

			}
			sum = Integer.MIN_VALUE;
			// System.out.println();
		}
		if (a[n - 1] < 0) {
			count++;
		}
		System.out.println(count);
	}
}