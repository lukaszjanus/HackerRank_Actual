package practice.java.introduction;

import java.util.Scanner;

/**
 * @title JavaEnd_Of_File 
 *
 * @date 20 sie 2020
 *
 * @author Lukasz Janus
 *
 */
public class JavaEnd_Of_File {
	
	 static Scanner sc = new Scanner(System.in);
	    
	    public static void main(String[] args) {
	        
	        int i=1;

	         while(sc.hasNext()){
	            System.out.println(i+" "+sc.nextLine());
	            i++;
	         }
	    }
	}