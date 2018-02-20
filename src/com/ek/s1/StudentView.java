package com.ek.s1;

public class StudentView {
	public void view(Student [] s) {
		for (int i = 0; i < s.length; i++) {
			System.out.println("이름 : "+s[i].name);
			System.out.println("번호 : "+s[i].num);
		}
		System.out.println("안녕");
	}

}
