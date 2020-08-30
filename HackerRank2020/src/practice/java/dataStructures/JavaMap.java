package practice.java.dataStructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @title Java Map
 *
 * 
 * 
 * @date 28 sie 2020
 *
 * @author Lukasz Janus
 *
 */
public class JavaMap {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();

			Map<String,Integer> mapa = new HashMap<>();
	
			for (int i = 0; i < n; i++) {
				String name = in.nextLine();
				int phone = in.nextInt();
				in.nextLine();
				mapa.put(name,phone);
			}
			
			ArrayList<String> list = new ArrayList<>();
			while (in.hasNext()) {
				String s = in.nextLine();
	
				list.add(s);
			}
			
			for(int i=0;i<list.size();i++) {
				String temp = list.get(i);
			if (mapa.containsKey(temp)) {
					System.out.println(temp+"="+mapa.get(temp));
				}else {
					System.out.println("Not found");
				}
				
			}
	}
}
