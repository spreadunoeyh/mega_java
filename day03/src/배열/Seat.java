package �迭;

import java.util.Scanner;

public class Seat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��ȭ ���� ���α׷� �Դϴ�.");
		
		int[] seat = new int[10];
		
		for (int i = 0; i < seat.length; i++) {		
		System.out.print(seat[i] + " ");
	}
		System.out.println();
		System.out.println("-------------------");
		for (int i = 0; i < seat.length; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("���Ÿ� ���ϴ� �¼���ȣ �Է�(����:0) >> ");
		int p = sc.nextInt();
		
			seat[p] = 1;
			
			for (int i = 0; i < seat.length; i++) {		
			System.out.print(seat[i] + " ");
		}
			System.out.println();
			System.out.println(p + " �� �¼��� ���� �Ǿ����ϴ�.");
		
		//5,6���ڸ� ����ó��
		// 0->1�� ����
		// ����ڸ� ��Ȳ ����Ʈ
	}

}
