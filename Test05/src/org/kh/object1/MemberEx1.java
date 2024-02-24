package org.kh.object1;

public class MemberEx1 {

	public static void main(String[] args) {
		Member kim = new Member();
		kim.setId("kkt");
		kim.setPw(123);
		kim.setEmail("kkt@gmail");
		kim.setBirth("1998");
		kim.setTel(00100);
		
		System.out.println("id :"+kim.getId());
		System.out.println("pw :"+kim.getPw());	
		System.out.println(kim.toString());
		
		
		
	}

}
