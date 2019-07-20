package 반복문;

import java.util.Scanner;

public class Whiletest8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int save = 0;

		while (true) {
			System.out.println("--------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고  | 4. 종료");
			System.out.println("--------------------------------");
			System.out.print("선택>> ");
			int a = sc.nextInt();
			if (a == 1) {
				System.out.print("예금액> ");
				int plus = sc.nextInt();
				save = save + plus;

			} else if (a == 2) {
				System.out.print("출금액> " );
				int minus = sc.nextInt();
				save = save - minus;
				
			} else if (a == 3) {
				System.out.println("잔고> " + save);
			}else if (a == 4) {
				System.out.println("프로그램 종료");
				break;
					}
			}
		}
}
