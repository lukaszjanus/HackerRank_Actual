package interviewPreparationKit.recursionAndBacktracking;

import java.util.Scanner;

/**
 * @title Recursion: Fibonacci Numbers
 *
 * @date 16 sie 2020
 *
 * @author Lukasz Janus
 *
 */
public class Recursion_FibonacciNumbers {
	
	  public static int fibonacci(int n) {


	        if(n==1 || n==2) return 1;
	        if(n==0) return 0;

	        return fibonacci(n-1)+fibonacci(n-2);
	    }


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        scanner.close();
	        System.out.println(fibonacci(n));
	    }
	}