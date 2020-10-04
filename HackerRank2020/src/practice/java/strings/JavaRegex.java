package practice.java.strings;

import java.util.Scanner;

/**
 * @title Java Regex (MyRegex class)
 * 
 * Additionally compare time Regex to simple IP method using conversion from string to for int.
 *
 * @date 4 paź 2020
 *
 * @author Lukasz Janus
 *
 */
public class JavaRegex {

	public static void main(String[] args) {
		/*
		 * Scanner in = new Scanner(System.in); while(in.hasNext()){ String IP =
		 * in.next(); System.out.println(IP.matches(new MyRegex().pattern)); }
		 */
		String IP = "111.111.111.111";

		System.out.println("Correct IP-number check: "+IP);
		long millisActualTime = System.nanoTime();
		System.out.println(IP.matches(new MyRegex().pattern));
		long executionTime = System.nanoTime() - millisActualTime;
		System.out.println("Regex czas true: " + executionTime);
		System.out.println();

		millisActualTime = System.nanoTime();
		System.out.println(check(IP));
		executionTime = System.nanoTime() - millisActualTime;
		System.out.println("Konwersja IP czas true: " + executionTime);

		IP = "111.111.111.511";

		System.out.println("Wrong IP-number check: "+IP);
		millisActualTime = System.nanoTime();
		System.out.println(IP.matches(new MyRegex().pattern));
		executionTime = System.nanoTime() - millisActualTime;
		System.out.println("Regex czas false: " + executionTime);
		System.out.println();

		millisActualTime = System.nanoTime();
		System.out.println(check(IP));
		executionTime = System.nanoTime() - millisActualTime;
		System.out.println("Konwersja IP czas false: " + executionTime);
		
//		System.out.println(Runtime.getRuntime().availableProcessors()); 

	}

	static String check(String ip) {
		ip = ip.replace(".", " ");
		String[] tab = ip.split(" ");

		if (tab.length == 4) {
			for (int i = 0; i < 4; i++) {
				int temp = Integer.valueOf(tab[i]);
				if (temp > 255 || temp < 0) {
					return "false";
				}
			}
		} else {
			return "false";
		}

		return "true";
	}
}

class MyRegex {
	public static String pattern = "((25[0-5]|2[0-4][0-9]|[01][0-9]{2}|[0]{3}|\\d{1,2})\\.){3}(25[0-5]|[2][0-4][0-9]|[01][0-9]{2}|[0]{3}|\\d{1,2})";
}
