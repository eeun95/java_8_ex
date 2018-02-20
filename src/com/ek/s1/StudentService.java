package com.ek.s1;

import java.util.Scanner;

public class StudentService {
	Scanner sc = new Scanner(System.in);
	Student [] stu = null;
	//학생 추가 메소드
	//학생인원수 입력, 학생수만큼 이름번호 입력
	public Student[] addStudent() {
		System.out.println("학생의 인원수를 입력하세요.");
		int num = sc.nextInt();
		stu = new Student[num];
		
		for(int i=0; i<num; i++) {
			Student s = new Student();
			System.out.println("이름을 입력하세요");
			s.name = sc.next();
			System.out.println("번호를 입력하세요");
			s.num = sc.nextInt();
			stu[i] = s;
		}
		System.out.println(stu[0].name);
		System.out.println(stu[1].name);
				
		return stu;
	}
}
