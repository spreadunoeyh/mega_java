package ���ǹ�;

import java.util.Scanner;

public class �ֹι�ȣ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹι�ȣ �Է�(-����)");
		String sn = sc.next();
		//charAt(��ġ��): string���� char �ѱ��ڸ� �����Ҷ� ���
		char gender = sn.charAt(6);
		System.out.println(gender);
		switch (gender) {
		case '1': case '3':
			System.out.println("��");
			
			break;
		case '2': case '4': 
			System.out.println("��");
		default:
			break;
		}
	}
}
