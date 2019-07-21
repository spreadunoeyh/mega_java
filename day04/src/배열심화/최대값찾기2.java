package 배열심화;

import java.util.Scanner;

public class 최대값찾기2 {

	public static void main(String[] args) {
		
		int sum = 0;
				
		int[] num = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.print("성적을 입력하십시오: ");			
			num[i] = sc.nextInt();			
			sum = sum + num[i];
		}
		
		System.out.println("평균 성적은 " +  (sum/5) + "입니다.");
		
	}
}
