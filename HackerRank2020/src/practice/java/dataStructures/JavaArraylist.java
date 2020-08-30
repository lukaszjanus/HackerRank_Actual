package practice.java.dataStructures;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @title Java Arraylist
 *
 * @date 27 sie 2020
 *
 * @author Lukasz Janus
 *
 */
public class JavaArraylist {

	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int a = Integer.parseInt(sc.nextLine());

		ArrayList<String[]> arr = new ArrayList<>();

		for (int i = 0; i < a; i++) {

			String[] subAr = sc.nextLine().split(" ");
			arr.add(subAr);

		}
		
		int b = Integer.parseInt(sc.nextLine());

		ArrayList<String[]> ind = new ArrayList<>();

		for (int i = 0; i < b; i++) {

			String[] subIn = sc.nextLine().split(" ");
			ind.add(subIn);

		}
		sc.close();

		
		for(int i=0;i<b;i++) {
			
			try {
				
				int ia=Integer.parseInt(ind.get(i)[0]);
                int ib=Integer.parseInt(ind.get(i)[1]);
                
                System.out.println(arr.get(ia-1)[ib]);
				
				
			}catch(Exception e) {
				System.out.println("ERROR!");
			}
			
		}
		
	}

}
