package practice.java.objectOrientedProgramming;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @title Java Iterator
 *
 * @date 12 wrz 2020
 *
 * @author Lukasz Janus
 *
 */
public class JavaIterator {
	  static Iterator func(ArrayList mylist){
	      Iterator it=mylist.iterator();
	      while(it.hasNext()){
	        // Object element = ~~~Complete this line~~~
	         //if(~~~Complete this line~~~)//Hints: use instanceof operator
	    	  Object element = it.next();
	    	  /*String test = element.toString();
	    	  if(test.equals("###")) {
	    		  break;  
	    	  }*/
	    	  if(element instanceof String) {
	    		  break;
	    	  }
			}
	      return it;	      
	   }
	   @SuppressWarnings({ "unchecked" })
	   public static void main(String []args){
	      ArrayList mylist = new ArrayList();
	      Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      int m = sc.nextInt();
	      for(int i = 0;i<n;i++){
	         mylist.add(sc.nextInt());
	      }
	      
	      mylist.add("###");
	      for(int i=0;i<m;i++){
	         mylist.add(sc.next());
	      }
	      
	      Iterator it=func(mylist);
	      while(it.hasNext()){
	         Object element = it.next();
	         System.out.println((String)element);
	      }
	   }
	}
