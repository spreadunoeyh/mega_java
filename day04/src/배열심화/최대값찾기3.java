package �迭��ȭ;

import java.util.Scanner;

public class �ִ밪ã��3 {

	public static void main(String[] args) {

		int[] score = null;
		int sum = 0;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("--------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("--------------------------------------------");
			System.out.print("����>>");
			int select = sc.nextInt();
			if (select == 1) {
				System.out.print("�л���>>");
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
				System.out.println("�ְ�����:" + max);
				System.out.println("�������:" + (sum / score.length));

			} else if (select == 5) {
				System.out.println("���α׷�����");
				break;

			}
		}

	}
}
