package org.kh.site2;
//대입 연산자 : 연산 후에 대입하는 연산자 - +=, *=, /=, %=, &=, |=, >>=, <<=,>>>=, ^=
//비트 연산자 : &(and), |(or), ~, ~(complement), ^(xor), >>(>>>,right shift), <<(left shift)
public class Operation7 {

	public static void main(String[] args) {
		int a = 20;
		int b = 15;
		int tmp;
		a +=b;
		b -=a;
		System.out.println("a="+a);
		System.out.println("b="+b);
		tmp = a;
		a =b;
		b=tmp;
		System.out.println("a="+a);
		System.out.println("b="+b);		
		
		int x = 0b01101;
		int y = 0b01011;
		System.out.println("x="+Integer.toBinaryString(x));
		System.out.println("y="+Integer.toBinaryString(y));
		System.out.println("x & y :"+Integer.toBinaryString(x&y));
		System.out.println("x | y :"+Integer.toBinaryString(x|y));
		System.out.println("x ^ y :"+Integer.toBinaryString(x^y));
		System.out.println("~x :"+Integer.toBinaryString(~x));
		System.out.println("x>>2:"+Integer.toBinaryString(x>>2));
		System.out.println("x<<2:"+Integer.toBinaryString(x<<2));
		
		//           16 8 4 2 1
		int i = 25; //1 1 0 0 1 
		int j = 30; //1 1 1 1 0 
		i &= j;
		System.out.println("i &= j :"+i); //1 1 0 0 0 24
		i=25;
		i |= j;
		System.out.println("i |= j :"+i);
		i=25;
		i ^=j;
		System.out.println("i ^= j :"+i);
		j>>=2;
		System.out.println("j >>= :"+j);
		j=30;
		j<<=2;
		System.out.println("j <<= :"+j);
		j=30;
		j>>>=2;
		System.out.println("j >>>= :"+j);
		
	}
}
