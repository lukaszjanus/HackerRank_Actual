package practice.java.dataStructures;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @title Java List
 *
 * @date 28 sie 2020
 *
 * @author Lukasz Janus
 *
 */
public class JavaList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            int l = scan.nextInt();
            list.add(l);
        }

        // String[] arrRowItems = scan.nextLine().split(" ");

        int b = scan.nextInt();

        for (int i = 0; i < b; i++) {
            String operation = scan.next();
            if (operation.equals("Insert")) {
                int ind = scan.nextInt();
                int val = scan.nextInt();
                list.add(ind, val);
            }
            if (operation.equals("Delete")) {
                int ind = scan.nextInt();
                list.remove(ind);
            }

        }
        
        scan.close();

        for (int i : list) {
            System.out.print(i + " ");
        }

	}
}
