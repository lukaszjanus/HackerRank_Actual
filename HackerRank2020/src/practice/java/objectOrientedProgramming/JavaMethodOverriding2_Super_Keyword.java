package practice.java.objectOrientedProgramming;

/**
 * @title Java Method Overriding 2 (Super Keyword) 
 *
 * @date 11 wrz 2020
 *
 * @author Lukasz Janus
 *
 */


class BiCycle{
	String define_me(){
		return "a vehicle with pedals.";
	}
}

class MotorCycle extends BiCycle{
	String define_me(){
		return "a cycle with an engine.";
	}
	
	MotorCycle(){
		System.out.println("Hello I am a motorcycle, I am "+ define_me());
        
		String temp=super.define_me(); //Fix this line

		System.out.println("My ancestor is a cycle who is "+ temp );
	}
}	

public class JavaMethodOverriding2_Super_Keyword {
	public static void main(String []args){
		MotorCycle M=new MotorCycle();
	}
}

