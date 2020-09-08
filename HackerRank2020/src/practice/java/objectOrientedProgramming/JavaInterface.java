package practice.java.objectOrientedProgramming;

import java.util.*;

/**
 * @title Java Interface
 *
 * @date 3 wrz 2020
 *
 * @author Lukasz Janus
 *
 */


interface AdvancedArithmetic {
	int divisor_sum(int n);
}

class MyCalculator {

	int divisor_sum(int n) {

		System.out.println("AdvancedArithmetic");

		if (n == 1) {
			return 1;
		}

		int result = 1 + n;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				result += i;
			}
		}

		return result;
	}
}

public class JavaInterface {

	public static void main(String[] args) {
		MyCalculator my_calculator = new MyCalculator();
		System.out.print("I implemented: ");
		ImplementedInterfaceNames(my_calculator);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(my_calculator.divisor_sum(n) + "\n");
		sc.close();
	}

	/*
	 * ImplementedInterfaceNames method takes an object and prints the name of the
	 * interfaces it implemented
	 */
	static void ImplementedInterfaceNames(Object o) {
		Class[] theInterfaces = o.getClass().getInterfaces();
		for (int i = 0; i < theInterfaces.length; i++) {
			String interfaceName = theInterfaces[i].getName();
			System.out.println(interfaceName);
		}
	}
}