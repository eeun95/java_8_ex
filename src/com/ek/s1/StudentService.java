package com.ek.s1;

import java.util.Scanner;

public class StudentService {
	Scanner sc = new Scanner(System.in);
	// 학생 추가 메소드
	// 학생인원수 입력, 학생수만큼 이름번호 입력

	public Student[] addStudent() {
		System.out.println("학생의 인원수를 입력하세요.");
		int num = sc.nextInt();
		Student[] stu = new Student[num];

		for (int i = 0; i < num; i++) {
			Student s = new Student();
			System.out.println("이름을 입력하세요");
			s.name = sc.next();
			System.out.println("번호를 입력하세요");
			s.num = sc.nextInt();
			stu[i] = s;
		}

		return stu;
	}

	public Student[] addPoint(Student[] ss) {
		for (int i = 0; i < ss.length; i++) {
			System.out.println(ss[i].name + "의 국어 점수를 입력하세요");
			ss[i].kor = sc.nextInt();
			System.out.println(ss[i].name + "의 영어 점수를 입력하세요");
			ss[i].eng = sc.nextInt();
			System.out.println(ss[i].name + "의 수학 점수를 입력하세요");
			ss[i].math = sc.nextInt();

			ss[i].total = ss[i].kor + ss[i].eng + ss[i].math;
			ss[i].avg = ss[i].total / 3.0;

		}

		return ss;
	}
}
