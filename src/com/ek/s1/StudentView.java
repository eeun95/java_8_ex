package com.ek.s1;

public class StudentView {
	public void view(Student[] s) {
		for (int i = 0; i < s.length; i++) {
			System.out.println("이름 : " + s[i].name);
			System.out.println("번호 : " + s[i].num);
			System.out.println("국어점수 : " + s[i].kor);
			System.out.println("수학점수 : " + s[i].math);
			System.out.println("영어점수 : " + s[i].eng);
			System.out.println("총점 : " + s[i].total);
			System.out.println("평균 : " + s[i].avg);
			System.out.println("===========================");

		}
	}

	public void numView(Student[] s, int num) {
		boolean check = true;
		for (int i = 0; i < s.length; i++) {
			if (num == s[i].num) {
				System.out.println("이름 : " + s[i].name);
				System.out.println("번호 : " + s[i].num);
				System.out.println("국어점수 : " + s[i].kor);
				System.out.println("수학점수 : " + s[i].math);
				System.out.println("영어점수 : " + s[i].eng);
				System.out.println("총점 : " + s[i].total);
				System.out.println("평균 : " + s[i].avg);
				check = !check;
			}
		}
		if(check) System.out.println("해당 번호가 없습니다.");
	}

}
