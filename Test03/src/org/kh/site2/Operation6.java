package org.kh.site2;
//논리 연산자(Logical Operation) : &&(and),||(or), !(not)
public class Operation6 {

	public static void main(String[] args) {
		int a = 26;
		int b = 28;
		int c = 27;
		System.out.println("a > b && a > c : "+ (a>b && a>c));
		System.out.println("a > b && b > c : "+ (a>b && b>c));
		System.out.println("a < b && b < c : "+ (a<b && b<c));
		System.out.println("a < b && b > c : "+ (a<b && b>c));
		System.out.println("a > b || a > c : "+ (a>b || a>c));
		System.out.println("a > b || b > c : "+ (a>b || b>c));
		System.out.println("a < b || b < c : "+ (a<b || b<c));
		System.out.println("a < b || b > c : "+ (a<b || b>c));
		System.out.println("!(a > b) : "+ (a>b));
		System.out.println("!(a < b) : "+ (a<b));
	}

}
