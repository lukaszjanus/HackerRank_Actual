package practice.dataStructures.heap;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @title QHEAP1
 *
 * @date 9 paź 2020
 *
 * @author Lukasz Janus
 *
 */
public class QHEAP1 {
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		int n = scan.nextInt();
		int op=0;
		
		//Set<Integer> heap = new HashSet<>(); //incorrect, but do not, why
		// result manualy is correct
        Set<Integer> heap = new TreeSet<>(); //fast tree and sorted Set

		for(int i=0;i<n;i++) {
			op=scan.nextInt();
			switch(op) {
			
			case 1:{
				
				heap.add(scan.nextInt());
				
				break;
			}
			
			case 2:{
				
				int del = scan.nextInt();
				if(heap.contains(del)) {
					heap.remove(del);	
				}
				break;
			}
			
			case 3:{
				
				
				for(int h : heap)		{
					System.out.println(h);
					break;
				}
				
			}
	
			}
		}
	}
}
