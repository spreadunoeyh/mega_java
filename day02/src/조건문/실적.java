package ���ǹ�;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		
		System.out.println("������ǥ: 1000");
		System.out.print("�Է°�: ");	

		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();	

	
		if (data >= 1000) {
			System.out.println("�����޼�!");
			double bonus = data * 0.2;
			System.out.println("����� ���ʽ��� " + (int)bonus + "����");
		} else {
			System.out.println("��Ÿ���׿�!! �����̴޼�");

		}
				
	
	}

}
