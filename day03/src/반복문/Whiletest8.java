package �ݺ���;

import java.util.Scanner;

public class Whiletest8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int save = 0;

		while (true) {
			System.out.println("--------------------------------");
			System.out.println("1. ���� | 2. ��� | 3. �ܰ�  | 4. ����");
			System.out.println("--------------------------------");
			System.out.print("����>> ");
			int a = sc.nextInt();
			if (a == 1) {
				System.out.print("���ݾ�> ");
				int plus = sc.nextInt();
				save = save + plus;

			} else if (a == 2) {
				System.out.print("��ݾ�> " );
				int minus = sc.nextInt();
				save = save - minus;
				
			} else if (a == 3) {
				System.out.println("�ܰ�> " + save);
			}else if (a == 4) {
				System.out.println("���α׷� ����");
				break;
					}
			}
		}
}
