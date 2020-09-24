package practice.java.advanced;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @title Java Reflection - Attributes 
 *
 * @date 21 wrz 2020
 *
 * @author Lukasz Janus
 *
 */
public class JavaReflection_Attributes {
	
    public static void main(String[] args){
        
    	Class student = Student.class;
    	
        Method[] methods = student.getDeclaredMethods();
       
        ArrayList<String> methodList = new ArrayList<>();
        for(int i=0;i<methods.length; i++){
            methodList.add(methods[i].getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }

}


class Student{
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void anothermethod(){
    	
    	
    }
    
}