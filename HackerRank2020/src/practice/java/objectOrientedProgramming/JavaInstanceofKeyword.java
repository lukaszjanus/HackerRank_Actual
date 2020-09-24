package practice.java.objectOrientedProgramming;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @title Java Instanceof keyword 
 *
 * @date 12 wrz 2020
 *
 * @author Lukasz Janus
 *
 */
class Student{}
class Rockstar{   }
class Hacker{}

public class JavaInstanceofKeyword {
	
	   static String count(ArrayList mylist){
	      int a = 0,b = 0,c = 0;
	      for(int i = 0; i < mylist.size(); i++){
	         Object element=mylist.get(i);
	         //if(~~Complete this line~~)
	         if(element instanceof Student)
	            a++;
	         //if(~~Complete this line~~)
	         if(element instanceof Rockstar)
	            b++;
	         //if(~~Complete this line~~)
	         if(element instanceof Hacker)
	            c++;
	      }
	      String ret = Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
	      return ret;
	   }

	   public static void main(String []args){
	      ArrayList mylist = new ArrayList();
	      Scanner sc = new Scanner(System.in);
	      int t = sc.nextInt();
	      for(int i=0; i<t; i++){
	         String s=sc.next();
	         if(s.equals("Student"))mylist.add(new Student());
	         if(s.equals("Rockstar"))mylist.add(new Rockstar());
	         if(s.equals("Hacker"))mylist.add(new Hacker());
	      }
	      System.out.println(count(mylist));
	   }
	}