package com.ek.s1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Student s = new Student();
		SchoolController scon = new SchoolController();
		StudentService ss = new StudentService();
		
		while(true) {
		System.out.println("1.학생등록 2.성적입력 3.성적조회 4.전체조회 5.종료");
		int num=scanner.nextInt();
		scon.start(num);
		if(num==5) break;
		
		}	
	}
}
