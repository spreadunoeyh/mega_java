package �ݺ���;

import java.util.Scanner;

public class Whiletest6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while (true) {
			System.out.print("�Է�(����:0): ");
			int data = sc.nextInt();
			if(data == 0) {
				System.out.println("���α׷� ����");
				break; // �ݺ��� ����
			}
			sum = sum  + data;
			System.out.println("��������� ��:  " + sum);
			//sum���ٰ� �Է°� ��� ���غ�����
			//���������  sum���� ���
		}
		System.out.println("��������: " + sum);
	}

}
