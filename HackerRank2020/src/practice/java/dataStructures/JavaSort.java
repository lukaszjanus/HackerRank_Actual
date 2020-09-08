package practice.java.dataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @title Java Sort
 *
 * @date 31 sie 2020
 *
 * @author Lukasz Janus
 *
 */

class Student implements Comparable<Student> {
	private int id;
	private String fname;
	private double cgpa;

	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}

	@Override
	public int compareTo(Student arg0) {

		int res = Double.compare(arg0.getCgpa(), this.getCgpa());

		if (res == 0) {
			return this.getFname().compareTo(arg0.getFname());
		}

		return res;
	}
}

//Complete the code
public class JavaSort {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student> studentList = new ArrayList<Student>();
		while (testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}

		Collections.sort(studentList);

		for (Student st : studentList) {
			System.out.println(st.getFname());
		}
	}
}
