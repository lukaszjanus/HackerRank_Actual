package practice.java.introduction;

import java.util.Scanner;

/**
 * @title Java Output Formatting
 *
 * @author Lukasz Janus
 *
 * @date 12 Sie 2020
 */

public class JavaOutputFormatting {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                if(s1.length()<15){
                    
                    int temp=15-s1.length();
                    for(int j=0;j<temp;j++){
                        s1=s1+" ";
                    }
                }

                int x=sc.nextInt();
                String s2=String.valueOf(x);
                if(s2.length()==1){
                    s2="00"+s2;
                }
                if(s2.length()==2){
                    s2="0"+s2;
                }
                
                System.out.println(s1+s2);
            }
            System.out.println("================================");
    }
}



