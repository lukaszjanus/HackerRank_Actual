package practice.dataStructures.heap;

import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @title Jesse and Cookies 2 - version with PriorityQueue
 *
 * @date 13 paź 2020
 *
 * @author Lukasz Janus
 *
 */
public class JesseAndCookies2 {

	/*
	 * Complete the cookies function below.
	 */
	static int cookies(int k, int[] A) {
		PriorityQueue<Integer> queue = new PriorityQueue<>();

		int first = 0;
		int second = 0;
		int count = 0;

		for (int a : A) {
			queue.add(a);
		}
		// System.out.println(queue.poll());
		for (int q : queue) {
			System.out.print(q + " ");
		}
		System.out.println();
		while (queue.size() > 1) {
			if (queue.peek() >= k) {
				return count;
			} else {
				first = queue.poll();
				second = queue.poll();
				int next = first + (second * 2);
				queue.add(next);
				count++;
				System.out.println(" while: " + count + " next: " + next);
				for (int q : queue) {
					System.out.print(q + " ");
				}
				System.out.println();
			}
		}

		if (queue.size() > 0 && queue.peek() >= k) {
			return count;
		} else {
			return -1;
		}
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int[] A = { 13, 47, 74, 12, 89, 74, 18, 38 }; // 5
		System.out.println(cookies(90, A));
		
		
		/*
		 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0].trim());

        int k = Integer.parseInt(nk[1].trim());

        int[] A = new int[n];

        String[] AItems = scanner.nextLine().split(" ");

        for (int AItr = 0; AItr < n; AItr++) {
            int AItem = Integer.parseInt(AItems[AItr].trim());
            A[AItr] = AItem;
        }

        int result = cookies(k, A);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
        */

	}
}