package practice.java.dataStructures;

import java.util.Scanner;
import java.util.Stack;

/**
 * @title Java Stack
 *
 * @date 28 sie 2020
 *
 * @author Lukasz Janus
 *
 */
public class JavaStack {
	public static void main(String[] argh) {

		Stack<String> stos = new Stack<>();

		/*
		 * Scanner sc = new Scanner(System.in); while (sc.hasNext()) { String input =
		 * sc.next();
		 * 
		 * stos.push(input); }
		 */

		stos.push("{");
		stos.push("}");
		stos.push("[");
		stos.push("]");

		int i=0;
		do {

			System.out.println(stos.get(i) + " " + stos.get(i + 1)+" "+stos.size());

			String q = stos.get(i);

			switch (q) {

			case "{": {
				
				System.out.println("delete {: "+stos.get(i) + " " + stos.get(i + 1));
				
				stos.pop();
				stos.pop();
				//break;
			}

			case "[": {
				System.out.println("delete [: "+stos.get(i) + " " + stos.get(i + 1));
				
				stos.pop();
				stos.pop();
				//break;
			}

			case "(": {
				System.out.println("delete (: "+stos.get(i) + " " + stos.get(i + 1));
				stos.pop();
				stos.pop();
			//	break;
			}

			}

			/*
			 * if(stos.get(i)&&(stos.get(i))){ System.out.println(i+"peek ok"); }
			 */
			for(String s : stos) {
				System.out.println("za switch: "+s+" "+stos.size());
			}

		}while(stos.size()>1);

	}
}
