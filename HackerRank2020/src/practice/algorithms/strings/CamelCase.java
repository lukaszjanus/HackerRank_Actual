package practice.algorithms.strings;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @title Camel Case
 *
 * @author Lukasz Janus
 *
 * @date 27 lip 2020
 */
public class CamelCase {

	  // Complete the camelcase function below.
    static int camelcase(String s) {
        
        //System.out.println(s);
        
        int temp=1;
        
        for(int i=1;i<s.length();i++) {
            char l=s.charAt(i);
            
            if((int)l>64 && (int)l<91) {
                temp++;
            }
        }
        
        return temp;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int result = camelcase(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
