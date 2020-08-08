/**
 * 
 */
package practice.algorithms.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @title Time Conversion
 *
 * @author Lukasz Janus
 *
 * @date 12 lip 2020
 */
public class TimeConversion {

	/*
	 * Complete the timeConversion function below.
	 */
	static String timeConversion(String s) {

		try {
			//input format
	        DateFormat df = new SimpleDateFormat("hh:mm:ssaa");
	        //output format
	        DateFormat outputformat = new SimpleDateFormat("HH:mm:ss");
		    
	        //parse date (from old to new and save as date)
		    Date date = df.parse(s);
		    
		    //convert to string
	        String output = outputformat.format(date);
	        
	        return output;
	        
		       
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  

		return s;

	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
	//	BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//		String s = scan.nextLine();

		String result = timeConversion("07:05:45PM");
		System.out.println(result);
		//bw.write(result);
		//bw.newLine();

		//bw.close();
	}
}
