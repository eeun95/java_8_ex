package com.ek.s1;

import java.util.Scanner;

public class SchoolController {
	// 메소드명 start 리턴 x
	// 1. 학생 등록 2.성적 입력 3.성적 조회 4.전체 조회 5.종료

	public void start() {
		Scanner scanner = new Scanner(System.in);

		Student[] ar = null;

		StudentService ss = new StudentService();
		StudentView sv = new StudentView();
		Student s = new Student();
		SchoolController scon = new SchoolController();

		while (true) {
			System.out.println("1.학생등록 2.성적입력 3.성적조회 4.전체조회 5.종료");
			int num = scanner.nextInt();

			if (num == 1) {
				System.out.println("학생을 등록하세요.");
				ar = ss.addStudent();
			} else if (num == 2) {
				System.out.println("성적을 입력하세요.");
				ar = ss.addPoint(ar);
			} else if (num == 3) {
				System.out.println("조회할 학생의 번호를 입력하세요.");
			} else if (num == 4) {
				System.out.println("전체 조회 결과");
				sv.view(ar);
			} else if (num == 5) {
				System.out.println("종료되었습니다.");
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
}
