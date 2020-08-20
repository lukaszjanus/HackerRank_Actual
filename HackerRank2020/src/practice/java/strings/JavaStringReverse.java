package practice.java.strings;

import java.util.Scanner;

/**
 * @title Java String Reverse
 *
 * @date 16 sie 2020
 *
 * @author Lukasz Janus
 *
 */
public class JavaStringReverse {

	public static void main(String[] args) {

		//Scanner sc = new Scanner(System.in);
		//String A = sc.next();
		//String A = "madam";
		String A = "java"; 
		
		boolean flag = true;
		int l = A.length()/2;
		int temp=A.length()-1;
		for (int i = 0; i < l; i++) {
			
			char t1=A.charAt(i);
			char t2=A.charAt(temp);
			
		//	System.out.println(i+" "+t1+" "+temp+" "+t2);
			
			if(t1!=t2) {
				flag=false;

				break;
			}
			temp--;
		}
		
		if(flag==true)System.out.println("Yes");
        if(flag==false) System.out.println("No");
	}
}