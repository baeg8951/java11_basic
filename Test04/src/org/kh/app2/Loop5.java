package org.kh.app2;

public class Loop5 {

	public static void main(String[] args) {
		int a = 0;
		while(a>10) {
			a++;
			System.out.println("a="+a);
		}

		do {
			System.out.println("a="+a);
		} while (a>10);
		for (int i = 10; i>0;i--) {
			System.out.println("i="+i);
		}
		int b =0;
		do {
			System.out.println("b="+b);
		}	while (a>10);
		for (int i = 0; i>0;i++) {
			System.out.println("b="+b);
		}
		
	}

}
