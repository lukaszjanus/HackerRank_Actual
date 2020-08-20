package interviewPreparationKit.Miscellaneous;

import java.io.IOException;
import java.util.Scanner;

/**
 * @title Flipping bits
 *
 * @date 20 sie 2020
 *
 * @author Lukasz Janus
 *
 */
public class FlippingBits {

	// Complete the flippingBits function below.
	static long flippingBits(long n) {

		long binary[] = new long[32];
		int in = binary.length - 1;
		//to binary
		while (n > 0) {
			binary[in] = (n % 2);
			n = n / 2;
			in--;
		}

		//convert
		for (int i = 0; i < binary.length; i++) {
			if (binary[i] == 0) {
				binary[i] = 1;
			} else {
				binary[i] = 0;
			}
		}

		//to long again
		long num = 2 * binary[0];
		for (int i = 1; i < binary.length - 1; i++) {
			num += binary[i];
			num = num * 2;
		}

		return num + binary[binary.length - 1];
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		long n = 1;
		// System.out.println(Long.MAX_VALUE);
		long result = flippingBits(n);
		System.out.println(result);
	}
}
