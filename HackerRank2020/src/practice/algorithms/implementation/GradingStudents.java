/**
 * 
 */
package practice.algorithms.implementation;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


/**
 * @title Grading Students
 *
 * @author Lukasz Janus
 *
 * @date 04 Sie 2020
 */
class Result {

	/*
	 * Complete the 'gradingStudents' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY. The function accepts
	 * INTEGER_ARRAY grades as parameter.
	 */

	public static List<Integer> gradingStudents(List<Integer> grades) {

		for (int i = 0; i < grades.size(); i++) {
			int a = grades.get(i);

			if (a > 37) {
				int temp = a % 5;
				// System.out.println(i + " "+temp);

				if (temp > 2) {
					int res = a + (5 - temp);
					// System.out.println(a+" "+(temp));
					// System.out.println(grades.get(i)+" przed ");
					grades.set(i, res);
					// System.out.println(grades.get(i)+" po ");
				}
			}
		}
		return grades;
	}

}

public class GradingStudents {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
			try {
				return bufferedReader.readLine().replaceAll("\\s+$", "");
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		}).map(String::trim).map(Integer::parseInt).collect(toList());

		List<Integer> result = Result.gradingStudents(grades);

		bufferedWriter.write(result.stream().map(Object::toString).collect(joining("\n")) + "\n");

		bufferedReader.close();
		bufferedWriter.close();
	}
}
