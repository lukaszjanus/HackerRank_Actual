/**
 * 
 */
package practice.algorithms.warmup;

import static java.util.stream.Collectors.toList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @title Diagonal Difference
 *
 * @author Lukasz Janus
 *
 * @date 29 cze 2020
 */
public class Diagonal_Difference {

	public static int diagonalDifference(List<List<Integer>> arr) {
		// Write your code here
		
		//System.out.println(arr);
		
		int r1=0;
		int r2=0;
		
		for(int i=0;i<arr.size();i++) {
			//System.out.println("Linia: "+i);
			for(int j=0;j<arr.size();j++) {	
//				System.out.print(arr.get(i).get(j));
				if(i==j) {
					//System.out.println("i:"+i+" j:"+j);
					//System.out.print(arr.get(i).get(j));
					r1+=arr.get(i).get(j);
				}			
			}
			//System.out.println("\n");
		}
		
		for(int i=0;i<arr.size();i++) {
	//		System.out.println("Linia: "+i);
			for(int j=arr.size()-1;j>=0;j--) {	
				//System.out.print(arr.get(i).get(j));
			//	System.out.println("i:"+i+" j:"+j);
				if(j==arr.size()-i-1) {
	//				System.out.println("i:"+i+" j:"+j);
					//System.out.print(arr.get(i).get(j));
					r2+=arr.get(i).get(j);
				}			
			}
			//System.out.println("\n");
		}
		
		//System.out.println(r1);
		//System.out.println(r2);
		int result = Math.abs(r1-r2);
		return result;

	}

	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		

		int n = Integer.parseInt(scanner.nextLine().trim());


		List<List<Integer>> arr = new ArrayList<>();

		for(int i=0;i<n;i++) {
			System.out.println("Linia: "+i);
			List<Integer> temp = new ArrayList<Integer>();
			for(int j=0;j<n;j++) {
				temp.add(Integer.parseInt(scanner.nextLine().trim()));
			}
			arr.add(i, temp);
		}

		int result = diagonalDifference(arr);
		System.out.println(result);
	}
}
