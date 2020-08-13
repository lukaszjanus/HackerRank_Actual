package practice.java.strings;

import java.util.Scanner;

/**
 * @title Java Substring Comparisons
 *
 * @date 13 sie 2020
 *
 * @author Lukasz Janus
 *
 */
public class JavaSubstringComparisons {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		java.util.List<String> arr = new java.util.ArrayList<String>();

		for (int i = 0; i <= s.length() - k; i++) {
//            System.out.println(s.substring(i, i+3));
			arr.add(s.substring(i, i + k));
		}

		java.util.Collections.sort(arr);

		smallest = arr.get(0);
		largest = arr.get(arr.size() - 1);

		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		// Scanner scan = new Scanner(System.in);
		// String s =
		// "ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs";
		// int k = 30;

		// result:
		// ASDFHDSFHsdlfhsdlfLDFHSDLFHsdl
		// sdlkfhsdlfhsLFDLSFHSDLFHsdkfhs

		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}
