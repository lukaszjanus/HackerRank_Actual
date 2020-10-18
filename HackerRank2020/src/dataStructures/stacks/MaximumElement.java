package dataStructures.stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * @title Maximum Element
 *
 * 
 * 
 * @date 7 paź 2020
 *
 * @author Lukasz Janus
 *
 */
public class MaximumElement {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		int i = 0;

		Stack<Integer> stos = new Stack<>();
		int oper = 0;
		int temp = 0;
		int max = Integer.MIN_VALUE;
		do {

			oper = in.nextInt();

			switch (oper) {
			case 1: {
				temp = in.nextInt();
				stos.push(temp);
				if (max < temp) {
					max = temp;
				}
				break;
			}
			case 2: {

				// System.out.println("Pop: "+max+" "+stos.peek());
				if (stos.peek() == max) {
					stos.pop();
					max = Integer.MIN_VALUE;

					for (int j = 0; j < stos.size(); j++) {
						if (max < stos.get(j)) {
							max = stos.get(j);
						}
					}

				} else {
					stos.pop();
				}

				break;
			}
			case 3: {

				/*//not pass all tests - time excedeed
				 * for(int j=0;j<stos.size();j++) { if(temp<stos.get(j)) { temp=stos.get(j); } }
				 */
				System.out.println(max);

				break;
			}
			}

			i++;
		} while (testCases > i);
	}
}
