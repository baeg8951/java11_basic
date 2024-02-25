package org.kh.app2;

import java.util.Scanner;

public class Loop4 {

	public static void main(String[] args) {

		int i =0, tot =0;
		while(i<5) {
			i++;
			tot=tot+i;
		}
			System.out.println("결과 :"+tot);
			
			
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력[2-9] :");
		int n= sc.nextInt();
		int j = 0;
		while (j<10) {
			j++;
			System.out.println(n+" * "+j+" = "+(n*j));
		}
		
		}

}
