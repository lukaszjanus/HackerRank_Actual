package practice.java.strings;

import java.util.Scanner;

/**
 * @title Java Anagrams
 *
 * @date 17 sie 2020
 *
 * @author Lukasz Janus
 *
 */
public class JavaAnagrams {

	static boolean isAnagram(String a, String b) {

		if (a == null || b == null) {
			return false;
		}

		a = a.toLowerCase();
		b = b.toLowerCase();
		boolean flag = false;
		int sb = 0;
		int sa = 0;
		for (int i = 0; i < a.length(); i++) {
			sa += a.charAt(i);
			// System.out.println(sa + " " + a.charAt(i));
		}
		for (int i = 0; i < b.length(); i++) {
			sb += b.charAt(i);
			// System.out.println(sb + " " + b.charAt(i));

		}
		if (sa != sb) {
			return false;
		} else {
			flag = true;
		}

		if (flag == true) {

			boolean[] aa = new boolean[a.length()];
			for (int i = 0; i < aa.length; i++) {
				aa[i] = false;
			}

			boolean[] bb = new boolean[b.length()];

			int l = a.length();
			int lb = b.length();
			for (int i = 0; i < l; i++) {

				char cA = a.charAt(i);

				for (int j = 0; j < lb; j++) {

					char cB = b.charAt(j);

					// System.out.println("i:" + i + " " + cA + ", j:" + j + " " + cB);
					// System.out.println("Break: " + aa[i] + " " + bb[j]);
					if (cA == cB && bb[j] == false) {

						aa[i] = true;
						bb[j] = true;
						// System.out.println("Break after: " + aa[i] + " " + bb[j]);
						break;
					}
				}
			}

			for (int i = 0; i < aa.length; i++) {
				if (aa[i] == false) {
					return false;
				}
			}

		}
		return true;

		// Complete the function
		// version with collections -> not checked for all tests,
		//because in this case I can't use lists.
/*
		a = a.toLowerCase();
		b = b.toLowerCase();

		List<String> listA = new ArrayList<String>();
		List<String> listB = new ArrayList<String>();
		for (int i = 0; i < a.length(); i++) {
			listA.add(String.valueOf(a.charAt(i)));
		}
		for (int i = 0; i < b.length(); i++) {
			listB.add(String.valueOf(b.charAt(i)));
		}

		Collections.sort(listA);
		Collections.sort(listB);

		// System.out.println(listA); // System.out.println(listB);

		return (listA.containsAll(listB)) ? true : false;
*/
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");

		/*
		 * 
		 * String a = "xyzw"; String b = "xyxy"; scan.close(); boolean ret =
		 * isAnagram(a, b); System.out.println((ret) ? "Anagrams" : "Not Anagrams");
		 * 
		 * a = "anagramm"; b = "marganaa"; ret = isAnagram(a, b);
		 * System.out.println((ret) ? "Anagrams" : "Not Anagrams");
		 * 
		 * a = "Hello"; b = "hello";
		 * 
		 * ret = isAnagram(a, b); System.out.println((ret) ? "Anagrams" :
		 * "Not Anagrams");
		 * 
		 * a = "aaaaa"; b = "aa";
		 * 
		 * ret = isAnagram(a, b); System.out.println((ret) ? "Anagrams" :
		 * "Not Anagrams");
		 */
	}
}
