package practice.java.objectOrientedProgramming;

/**
 * @title Java Inheritance II
 *
 * @date 3 wrz 2020
 *
 * @author Lukasz Janus
 *
 */

class Arithmetic{

    int add(int a, int b){
        return a+b;
    }
}

 class Adder extends Arithmetic{

     Adder(){
         super();
     }
}
 
public class JavaInheritance_II {

	public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();
        
        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());  
        
        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
     }
}