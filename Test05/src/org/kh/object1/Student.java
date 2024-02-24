package org.kh.object1;

public class Student {
		String name = "아무개";
		int kor = 100;
		int eng = 50;
		int mat = 25;
		
		int tot () {
			return this.kor+this.eng+this.mat;
		}
		
		float avg() {
			return (this.kor+this.eng+this.mat) / 3.0f;
		}
		
		void resulting() {
			System.out.println(name+"총점은"+this.tot()+"평균은"+this.avg());
		}

	
}
