package ������;

import java.util.Scanner;

public class ����ý��� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Account a = null; // �޸� Ȯ��
		
		while (true) { // ���ѷ���
			System.out.println("-----------------------------------");
			System.out.println("1.���»���|2.���¸��|3.����|4.���|5.����");
			System.out.println("-----------------------------------");
			System.out.print("����>> ");
			int input = sc.nextInt();
			
			if (input == 1) { // ���»���
				System.out.println("------");
				System.out.println("���»���");
				System.out.println("------");
				System.out.print("���¹�ȣ: ");
				String data1 = sc.next();
				System.out.print("������: ");
				String data2 = sc.next();
				System.out.print("�ʱ� �Աݾ�: ");
				int data3 = sc.nextInt();			
				a = new Account(data1, data2, data3);
				System.out.println("���: ���°� �����Ǿ����ϴ�.");
				

			} else if (input == 2) { // ���¸��
				System.out.println(a);
				//toString() �޼ҵ� ȣ��

			} else if (input == 3) { // ����
				System.out.println("----------");
				System.out.println("����");
				System.out.println("----------");
				System.out.print("���ݾ�: ");
				int data4 = sc.nextInt();
				a.total = a.total + data4;  
				System.out.println("����ݾ� :" + a.total + "��");

			} else if (input == 4) { // ���
				System.out.println("----------");
				System.out.println("���");
				System.out.println("----------");
				System.out.print("��ݾ�: ");
				int data5 = sc.nextInt();
				a.total = a.total - data5;  
				System.out.println("����ݾ� :" + a.total + "��");

			} else {// 5�϶� ����
				System.out.println("���α׷� �����մϴ�.");
				break;
			}
		}
	}

}
