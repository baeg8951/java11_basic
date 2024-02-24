package sec2;

public class OverloadEx2 {

	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setBno(101);
		b1.setBname("책");
		b1.setPrice(42000);
		b1.setAuthor("김기태");
		b1.setPub("한빛미디어");

		Book b2 = new Book();
		b2.setBno(102);
		b2.setBname("자바 프로그래밍 입문");
		b2.setPrice(25000);
		b2.setAuthor("박은종");
		b2.setPub("이지스퍼블리싱");
	
		Book b3 = new Book();
		b3.print();
		b3.print(b1.getBname(), b1.getPrice(), b1.getAuthor());
		b3.print(b2.getBname(), b2.getPrice(), b2.getAuthor());
	}

}
