package org.kh.app;
// 조건문 if~else~ : if(조건식) { 조건식이 참일때 실행문; } else {조건식이 거짓일때 실행문;}
public class Condition2 {

	public static void main(String[] args) {
		char sel = 1;
		String gender;
		if (sel ==1 || sel ==3) gender = "남성";
		else gender = "여성";
		
		System.out.printf("%n당신의 성별은 %s", gender);
		}
}