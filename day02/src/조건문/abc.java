package ���ǹ�;

import java.util.Scanner;

public class abc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ABC �Է�: ");
		String score = sc.next();
		char abc = score.charAt(0);
		System.out.println(abc);
		
		switch (abc) {
		case 'A':
			System.out.println("�ֿ���Դϴ�");
			break;
		case 'B':
			System.out.println("����Դϴ�");
			break;
		case 'C':
			System.out.println("�����Դϴ�");
			break;
		default:
			System.out.println("������� ���߽��ϴ�.");
			break;
		}
				
	}

}
