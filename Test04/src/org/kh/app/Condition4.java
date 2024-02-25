package org.kh.app;

import java.util.Scanner;

public class Condition4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수 입력[0-100] :");
		int point = scan.nextInt();
		String result;
		
		if(point >=90) {
			result = "A";
			if((point%10>=7 && point%10<=9)  || point  == 100) {
				result = result + "+";
			} else if (point%10>=3 && point%10<=6) {
				result = result + "0";
			} else if (point%10>=0 && point%10<=2) {
				result = result + "-";
			}
		}	else if (point>=80) {
				result = "B";
			if (point%10>=7 && point%10<=9) {
				result = result + "+";
			}	else if (point%10>=6 && point%10<=9) {
				result = result +"0";
			}	else if (point%10>=0 && point%10<=3) {
				result = result +"-";
			}	
		
			}  else {
				result ="F";
		
	}


		String rank = "";
		switch (result){
			case "A+":
				rank = "학업우수상";
				break;
			case "A0":
				rank = "노력상";
				break;
			case "A-":
				rank = "아차상";
				break;
			default:
				rank = "";
		}
		System.out.println("당신의 점수 : "+point);
		System.out.println("당신의 점수 : "+result);
		System.out.println("당신의 점수 : "+rank);
		}
}