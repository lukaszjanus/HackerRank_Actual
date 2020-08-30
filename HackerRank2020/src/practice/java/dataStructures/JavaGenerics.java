package practice.java.dataStructures;

import java.lang.reflect.Method;

/**
 * @title Java Generics
 *
 * @date 29 sie 2020
 *
 * @author Lukasz Janus
 *
 */
public class JavaGenerics {

	public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
      
    }
}


class Printer
{
	/**
	 * Generic method to display different type of arrays.
	 * Overload method is not allowed in this case.
	 *  
	 * @param <T>
	 * @param ar
	 */
	static <T> void printArray(T[] ar){
		for(T i : ar) {
			System.out.println(i);
		}
	}
}