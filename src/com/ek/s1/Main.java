package com.ek.s1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Student s = new Student();
		SchoolController scon = new SchoolController();
		StudentService ss = new StudentService();

		scon.start();

	}
}
