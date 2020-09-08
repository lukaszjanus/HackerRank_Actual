package practice.java.advanced;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

import javax.xml.bind.DatatypeConverter;

/**
 * @title Java MD5
 *
 * @date 8 wrz 2020
 *
 * @author Lukasz Janus
 *
 */
public class JavaMD5 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String s1 = sc.nextLine();

		md5(s1);
	}

	/**
	 * @param s1
	 */
	private static void md5(String s1) {

		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(s1.getBytes(), 0, s1.length());

			// md.update(s1.getBytes());
			byte[] digest = md.digest();
			String myHash = DatatypeConverter.printHexBinary(digest).toUpperCase();
			System.out.println(myHash.toLowerCase());

		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}