package dataStructures.stacks;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

/**
 * @title Equal Stacks
 * 
 * @author Lukasz Janus
 *
 * @date 11 Sie 2020
 */
public class EqualStacks {
	
	 /*
     * Complete the equalStacks function below.
     */
    static int equalStacks(int[] h1, int[] h2, int[] h3) {

//heights        
        int hh1 = 0;
        int hh2 = 0;
        int hh3 = 0;

        for (int i : h1) {
            hh1 += i;
        }
        for (int i : h2) {
            hh2 += i;
        }
        for (int i : h3) {
            hh3 += i;
        }

        if (hh1 == hh2 && hh2 == hh3) {
            return hh1;
        }
//temporary start height for h2 and h3
        int temph2 = hh2;
        int temph3 = hh3;

//lengths for loops
        int h1l = h1.length;
        int h2l = h2.length;
        int h3l = h3.length;

//three loops 'for'
        for (int i = 0; i < h1l; i++) {
            hh1 -= h1[i];
            
            for (int j = 0; j < h2l; j++) {
                hh2 -= h2[j];
                
                //to not check all sums - level 1
                if(hh1>hh2) {
                    break;
                }
                if (hh1 == hh2) {
                    for (int k = 0; k < h3l; k++) {
                        hh3 -= h3[k];

                        //to not check all sums - level 2
                        if(hh2>hh3) {
                            break;
                        }
                        if (hh2 == hh3) {
                            return hh1;
                        }
                    }
                    hh3 = temph3;
                }
            }
            hh2 = temph2;
        }
//default 'return'
        return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] n1N2N3 = scanner.nextLine().split(" ");

        int n1 = Integer.parseInt(n1N2N3[0].trim());

        int n2 = Integer.parseInt(n1N2N3[1].trim());

        int n3 = Integer.parseInt(n1N2N3[2].trim());

        int[] h1 = new int[n1];

        String[] h1Items = scanner.nextLine().split(" ");

        for (int h1Itr = 0; h1Itr < n1; h1Itr++) {
            int h1Item = Integer.parseInt(h1Items[h1Itr].trim());
            h1[h1Itr] = h1Item;
        }

        int[] h2 = new int[n2];

        String[] h2Items = scanner.nextLine().split(" ");

        for (int h2Itr = 0; h2Itr < n2; h2Itr++) {
            int h2Item = Integer.parseInt(h2Items[h2Itr].trim());
            h2[h2Itr] = h2Item;
        }

        int[] h3 = new int[n3];

        String[] h3Items = scanner.nextLine().split(" ");

        for (int h3Itr = 0; h3Itr < n3; h3Itr++) {
            int h3Item = Integer.parseInt(h3Items[h3Itr].trim());
            h3[h3Itr] = h3Item;
        }

        int result = equalStacks(h1, h2, h3);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
