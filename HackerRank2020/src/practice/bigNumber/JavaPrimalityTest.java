package practice.bigNumber;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @title Java Primality Test (Big Integer library)
 *
 * @date 30 sie 2020
 *
 * @author Lukasz Janus
 *
 */
public class JavaPrimalityTest {

   
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

    	BigInteger v = sc.nextBigInteger();

        sc.close();
        
        System.out.println( (v.isProbablePrime(1)) ? "prime" : "not prime");

    }

	
}