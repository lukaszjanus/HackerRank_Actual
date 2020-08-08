/**
 * 
 */
package practice.algorithms.strings;

/**
 * @title Palindromic Border  - nie zrobione
 *
 * @author Lukasz Janus
 *
 * @date 14 lip 2020
 */
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class PalindromicBorder {

    /*
     * Complete the palindromicBorder function below.
     */
    static int palindromicBorder(String s) {
       
       System.out.print(s);


        for(int i=0;i<s.length();i++){
            s.charAt(i);
        }

       return 0;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int result = palindromicBorder(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
