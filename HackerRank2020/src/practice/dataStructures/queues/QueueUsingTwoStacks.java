package practice.dataStructures.queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

/**
 * @title Queue using Two Stacks
 *
 * @date 18 paź 2020
 *
 * @author Lukasz Janus
 *
 */
public class QueueUsingTwoStacks {

	/*
	 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
	 * class should be named Solution.
	 */
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scan.nextInt();
		int op = 0;

		Queue<Integer> queue = new ArrayDeque<>();

		for (int i = 0; i < n; i++) {
			op = scan.nextInt();
			switch (op) {

			case 1: {

				queue.add(scan.nextInt());

				break;
			}

			case 2: {

				queue.remove();
				break;
			}

			case 3: {
				System.out.println(queue.element());

			}

			}
		}
	}
}