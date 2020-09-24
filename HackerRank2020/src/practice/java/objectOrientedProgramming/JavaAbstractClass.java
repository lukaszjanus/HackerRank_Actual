package practice.java.objectOrientedProgramming;

import java.util.Scanner;

/**
 * @title Java Abstract Class 
 *
 * @date 15 wrz 2020
 *
 * @author Lukasz Janus
 *
 */

abstract class Book{
	String title;
	abstract void setTitle(String s);
	String getTitle(){
		return title;
	}
	
}

class MyBook extends Book{

	void setTitle(String s){
        this.title = s;
    }

}


public class JavaAbstractClass {
	public static void main(String []args){
		//Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		MyBook new_novel=new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: "+new_novel.getTitle());
      	sc.close();
		
	}
}