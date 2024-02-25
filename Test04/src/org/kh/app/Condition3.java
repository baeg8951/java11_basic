package org.kh.app;

import java.util.Scanner;

//조건문 if~elseif(~else~)
public class Condition3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수 입력[0-100] :");
		int point = scan.nextInt();
		char result;
		
		if(point>=90) { 	
			result  = 'A';
	    } 	else if(point>=80) {
	    	result = 'B';
	    } 	else if (point>=70) {
	    	result = 'C';
	    } 	else if (point>=60) {	
	    	result = 'D';
	    }	else { result = 'F';	    }
		
		System.out.println("당신의 학점은"+point+"입니다");
		System.out.println("당신의 학점은"+result+"입니다");
	}
}
