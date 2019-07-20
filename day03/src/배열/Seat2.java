package 배열;

import java.util.Scanner;

public class Seat2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] seat = new int[10];
		int count = 0;

		System.out.println("■ 영화 예매 프로그램 입니다. ■ ");
		System.out.println();

		while (true) {
			System.out.println("===================");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			System.out.println("-------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");
			}
			System.out.println();
			System.out.println("===================");
			System.out.print("예매를 원하는 좌석번호 입력(종료:11) >> ");
			int p = sc.nextInt();

			if (p == 11) {
				int total = count * 10000;
				System.out.println("예매 프로그램을 종료합니다.");
				System.out.println("당신이 지불할 총 금액은 " + total + "입니다.");

				break;
			}

			if (seat[p] == 0) {
				seat[p] = 1;
				count++;

				System.out.println(p + " 번 좌석이 예매 되었습니다.");
				System.out.println();

			} else if (seat[p] == 1) {
				System.out.println("이미 예매된 좌석입니다. 다른 좌석을 선택해주세요.");
				System.out.println();
			}

		}

	}

}
