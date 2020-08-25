package practice.java.dataStructures;

import java.util.Scanner;

/**
 * @title Java 1D Array
 *
 * @date 23 sie 2020
 *
 * @author Lukasz Janus
 *
 */
public class Java1DArray {

    public static void main(String[] args) {
 	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a = new int[n];
        
        for (int i = 0; i < a.length; i++) {
            a[i]=scan.nextInt();
        }


        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}