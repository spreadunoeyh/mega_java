package �迭;

import java.util.Scanner;

public class Seat2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] seat = new int[10];
		int count = 0;

		System.out.println("�� ��ȭ ���� ���α׷� �Դϴ�. �� ");
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
			System.out.print("���Ÿ� ���ϴ� �¼���ȣ �Է�(����:11) >> ");
			int p = sc.nextInt();

			if (p == 11) {
				int total = count * 10000;
				System.out.println("���� ���α׷��� �����մϴ�.");
				System.out.println("����� ������ �� �ݾ��� " + total + "�Դϴ�.");

				break;
			}

			if (seat[p] == 0) {
				seat[p] = 1;
				count++;

				System.out.println(p + " �� �¼��� ���� �Ǿ����ϴ�.");
				System.out.println();

			} else if (seat[p] == 1) {
				System.out.println("�̹� ���ŵ� �¼��Դϴ�. �ٸ� �¼��� �������ּ���.");
				System.out.println();
			}

		}

	}

}
