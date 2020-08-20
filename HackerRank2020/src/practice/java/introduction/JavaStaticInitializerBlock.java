package practice.java.introduction;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * @title Java Static Initializer Block
 *
 * @date 20 sie 2020
 *
 * @author Lukasz Janus
 *
 */
public class JavaStaticInitializerBlock {
	
	static boolean flag = true;
	static Scanner sc = new Scanner(System.in);
	static int B = sc.nextInt();
	static int H = sc.nextInt();

	static {
	    try {
	        
	        if(B<=0 || H<=0) {
	            flag=false;
	            System.out.println("java.lang.Exception: Breadth and height must be positive");
	        }
	        
	    }catch(Exception e){
	        System.out.println(e+"java.lang.Exception: Breadth and height must be positive");
	    }  
	}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class
