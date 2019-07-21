package 배열심화;

import java.util.Scanner;

public class 최대값찾기 {

	public static void main(String[] args) {
		
		int[] num = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.print("숫자입력: ");
			// int data = sc.nextInt();
			// num[i] = data;
			
			num[i] = sc.nextInt();
		
			
		}
		
		// 비교해서 항상 그 때까지의 최대값이 저장되도록 하는 변수

		int max = num[0];

		for (int i = 0; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
			}
		}
		System.out.println("최대값은 " + max);

		int min = num[0];

		for (int i = 0; i < num.length; i++) {
			if (min > num[i]) {
				min = num[i];
			}
		}
		System.out.println("최소값은 " + min);
	}
}
