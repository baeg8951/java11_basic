package org.kh.app2;

public class Loop1 {

	public static void main(String[] args) {
		int n =0;
		for (int i = 0; i<10; i++)
			n = n+1;
		System.out.println("n="+n);
		
		int []nums = {80,95,75,60,100,65,70,90,85,95};
		String []names = {"김","이","박","최","정","오","배","강","장","계"};
		int tot = 0, max = 0, min = 100;
			System.out.println("\n이름\t점수\t학점\t판정");
		for (int i=0; i<10;i++) {
			tot += nums[i];
			System.out.print(names[i]+"\t");
			System.out.print(nums[i]+"\t");
			if(nums[i]>=90) {
			System.out.print("A\t");
		}	else if(nums[i]>=80) {
			System.out.print("B\t");
		}	else if(nums[i]>=70) {
			System.out.print("C\t");
		}	else if(nums[i]>=60) {
			System.out.print("D\t");
		}	else {
			System.out.print("F\t");			
		}	if(nums[i]>=70) {
			System.out.print("합격\n");
		}	else {
			System.out.print("탈락\n");
		}
		if(nums[i]>max) max = nums[i];
		if(nums[i]<min) min = nums[i];
	}
	System.out.println("전체 총점 : "+tot);
	System.out.println("전체 평균 : "+(tot/10.0f));
	System.out.println("최대 점수 : "+max);
	System.out.println("최소 점수 : "+min);
   }
	}