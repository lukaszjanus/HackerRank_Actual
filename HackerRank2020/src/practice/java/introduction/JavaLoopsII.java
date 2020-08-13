package practice.java.introduction;

import java.util.Scanner;

/**
 * @title Java Loops II
 *
 * @author Lukasz Janus
 *
 * @date 12 Sie 2020
 */
public class JavaLoopsII {

	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
        int result=0;

        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int temp=a;

            for(int j=0;j<n;j++){
                temp+=(Math.pow(2,j)*b);

                System.out.print(temp+" ");
            }
           System.out.print("\n");
            //result+=temp;

        }
        in.close();
    }
}