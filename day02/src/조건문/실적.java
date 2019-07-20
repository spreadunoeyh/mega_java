package 조건문;

import java.util.Scanner;

public class 실적 {

	public static void main(String[] args) {
		
		System.out.println("실적목표: 1000");
		System.out.print("입력값: ");	

		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();	

	
		if (data >= 1000) {
			System.out.println("실적달성!");
			double bonus = data * 0.2;
			System.out.println("당신의 보너스는 " + (int)bonus + "만원");
		} else {
			System.out.println("안타깝네요!! 실적미달성");

		}
				
	
	}

}
