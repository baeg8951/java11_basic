package org.kh.app;
//조건문 if : if(조건식) {처리할 문장;} //처리할 문장이 한 줄일 경우 {} 생략 가능
public class Condition1 {

	public static void main(String[] args) {
		int point = 80;
		String pass = "합격";
				
		if(point<=75) pass ="불합격";
		
		System.out.printf("당신의 점수는 %d이며, 판정은 %s 입니다", point, pass);
		System.out.println("\n당신의 점수는"+point+"이며, 판정은"+ pass +"입니다");
				
				
	}

}
