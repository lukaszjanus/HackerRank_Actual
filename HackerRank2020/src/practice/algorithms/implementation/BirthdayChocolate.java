package practice.algorithms.implementation;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 * @title Birthday Chocolate
 *
 * @author Lukasz Janus
 *
 * @date 06 Sie 2020
 */
public class BirthdayChocolate {

	// Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {

        int result = 0;

        if(s.size()==1 && s.get(0)==d){
            return 1;
        }

        for (int i = 0; i < s.size() - m+1; i++) {

            int si = s.get(i);
            
            for (int j = i + 1; j < i + m; j++) {

                si += s.get(j);
        
            }
            if(si==d){
                    result++;
                }
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(dm[0]);

        int m = Integer.parseInt(dm[1]);

        int result = birthday(s, d, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
