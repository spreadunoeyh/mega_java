package �迭��ȭ;

import java.util.Scanner;

public class �ִ밪ã��2 {

	public static void main(String[] args) {
		
		int sum = 0;
				
		int[] num = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.print("������ �Է��Ͻʽÿ�: ");			
			num[i] = sc.nextInt();			
			sum = sum + num[i];
		}
		
		System.out.println("��� ������ " +  (sum/5) + "�Դϴ�.");
		
	}
}
