package �迭��ȭ;

import java.util.Scanner;

public class �ִ밪ã�� {

	public static void main(String[] args) {
		
		int[] num = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.print("�����Է�: ");
			// int data = sc.nextInt();
			// num[i] = data;
			
			num[i] = sc.nextInt();
		
			
		}
		
		// ���ؼ� �׻� �� �������� �ִ밪�� ����ǵ��� �ϴ� ����

		int max = num[0];

		for (int i = 0; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
			}
		}
		System.out.println("�ִ밪�� " + max);

		int min = num[0];

		for (int i = 0; i < num.length; i++) {
			if (min > num[i]) {
				min = num[i];
			}
		}
		System.out.println("�ּҰ��� " + min);
	}
}
