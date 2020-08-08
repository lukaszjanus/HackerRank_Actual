/**
 * 
 */
package practice.algorithms.warmup;

import java.util.Scanner;

/**
 * Staircase
 * 
 * @author Lukasz Janus
 * 
 * Date: 29.06.2020.
 */
public class Staircase {

	
	// Complete the staircase function below.
    static void staircase(int n) {
    	
    	for(int i=1; i<=n; i++) {
    		//System.out.println(i);
    		for(int j=1;j<=n;j++) {
    			
    			if((n-j)<i)
    			System.out.print("#");
    			else
    				System.out.print(" ");
    		}
    		System.out.println("");
    	}


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
      //  int n = scanner.nextInt();
    //    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(4);

        scanner.close();
    }
    
}
