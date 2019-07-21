package 배열심화;

import java.util.Scanner;

public class 최대값찾기3 {

	public static void main(String[] args) {

		int[] score = null;
		int sum = 0;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택>>");
			int select = sc.nextInt();
			if (select == 1) {
				System.out.print("학생수>>");
				int s = sc.nextInt();
				score = new int[s];

			} else if (select == 2) {
				for (int i = 0; i < score.length; i++) {
					System.out.print("scores[" + i + "] >");
					score[i] = sc.nextInt();
				}

			} else if (select == 3) {
				for (int i = 0; i < score.length; i++) {
					System.out.println("scores[" + i + "] >" + score[i]);
				}

			} else if (select == 4) {
				int max = score[0];
				for (int j = 0; j < score.length; j++) {

					sum = sum + score[j];

					if (max < score[j]) {
						max = score[j];
					}
				}
				System.out.println("최고점수:" + max);
				System.out.println("평균점수:" + (sum / score.length));

			} else if (select == 5) {
				System.out.println("프로그램종료");
				break;

			}
		}

	}
}
