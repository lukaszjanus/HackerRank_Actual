package practice.algorithms.warmup;

import java.io.*;
import java.util.*;


/**
 * Compare the Triplets
 * 
 * @author Lukasz Janus
 *
 *  Date: 28.06.2020
 */
public class Compare_the_Triplets {

	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

		List<Integer> r = new ArrayList<Integer>();
		int aa = 0;
		int bb = 0;
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) > b.get(i)) {
				aa += 1;
			}
			if (a.get(i) < b.get(i)) {
				bb += 1;
			}
		}
		r.add(aa);
		r.add(bb);
		return r;
	}

	public static void main(String[] args) throws IOException {

		List<Integer> a = new ArrayList<Integer>();
		a.add(17);
		a.add(28);
		a.add(30);

		List<Integer> b = new ArrayList<Integer>();
		b.add(99);
		b.add(16);
		b.add(8);

		List<Integer> result = compareTriplets(a, b);

		System.out.println(result);
	}
}
