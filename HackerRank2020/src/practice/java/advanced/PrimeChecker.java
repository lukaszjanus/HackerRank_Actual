package practice.java.advanced;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;
//added library
import static java.lang.System.in;

/**
 * @title Prime Checker
 * 
 * ("(...)The class Prime should contain a single method checkPrime(...)")
 *
 * @date 25 wrz 2020
 *
 * @author Lukasz Janus
 *
 */
class Prime {

	public static void checkPrime(int... n) {

		for (int i = 0; i < n.length; i++) {

			boolean flag = true;

			if (n[i] == 0 || n[i] == 1) {
				flag = false;
			}

			for (int j = 2; j < n[i]; j++) {
				if (n[i] % j == 0) {
					flag = false;
					break;
				}
			}

			if (flag) {
				System.out.print(n[i] + " ");
			}
		}
		System.out.println();
	}
	
}

public class PrimeChecker {
	public static void main(String[] args) {
		try {

			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			int n1 = 2;
			int n2 = 1;
			int n3 = 3;
			int n4 = 4;
			int n5 = 5;
			Prime ob = new Prime();
			System.out.println("n1: ");
			ob.checkPrime(n1);
			System.out.println("n2: ");
			ob.checkPrime(n1, n2);
			System.out.println("n3: ");
			ob.checkPrime(n1, n2, n3);
			System.out.println("n5: ");
			ob.checkPrime(n1, n2, n3, n4, n5);
			Method[] methods = Prime.class.getDeclaredMethods();
			Set<String> set = new HashSet<>();
			boolean overload = false;
			for (int i = 0; i < methods.length; i++) {
				if (set.contains(methods[i].getName())) {
					overload = true;
					break;
				}
				set.add(methods[i].getName());

			}
			if (overload) {
				throw new Exception("Overloading not allowed");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
