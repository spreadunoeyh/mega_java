package ���ǹ�;

import java.util.Scanner;

public class ���1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------");
		System.out.print("������ �����? ");
		String tem = sc.next();
		System.out.print("���� ���� �򰡴�? ");
		String cri = sc.next();
		System.out.print("���� �Ź� �������? ");
		double shoe = sc.nextDouble();
		System.out.println("--------------");
				
		System.out.println("������ " + tem + "��, �����򰡴� " 
		+ cri + ", �Ź���" + shoe );	
		
		
		System.out.print("ù��° ���ڴ�? ");
		int first = sc.nextInt();
		System.out.print("�ι�° ���ڴ�? ");
		int seco = sc.nextInt();
		if (first == seco ) {
			System.out.println("�μ��� �����ϴ�.");			
		} else {
			System.out.println("�μ��� �ٸ��ϴ�.");
		}
		
		System.out.print("������: ");
		int money = sc.nextInt();
		System.out.print("��ǰ�� �Ѿ�: ");
		int price = sc.nextInt();
		System.out.println("�ΰ���: " + (int)( price * 0.1) );
		System.out.println("�ܵ�: " + ( money - price ) );
		
				
	}
}
