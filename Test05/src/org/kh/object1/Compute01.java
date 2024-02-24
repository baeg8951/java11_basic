package org.kh.object1;

public class Compute01 {
	
	void fnc1() {
		System.out.println("메소드 (함수)1");
	}	
	void fnc2(int a) {
		System.out.println(a+"를 입력하였습니다");
	}
	int fnc3() {
		return 1004;
	}
	String fnc4(int point) {
		if (point>=80) return "합격";
		else return "불합격";
	}
}	
