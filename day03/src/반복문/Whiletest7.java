package �ݺ���;

import java.util.Random;
import java.util.Scanner;

public class Whiletest7 {

	// ctrl + shift + f :�ڵ�����

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int data2 = r.nextInt(100);
		int target = data2;
		int count = 0;
		
		while (true) {
			count++;
			System.out.print("������ �����Է�: ");
			int a = sc.nextInt();
			if (a == target) {
				System.out.println("�����մϴ�. �����Դϴ�.");
				System.out.println("����� �õ��� Ƚ����: " + count + "�� �Դϴ�.");
				System.out.println("����� ������ Ƚ����: " + (count-1) + "�� �Դϴ�.");
				break;
			} else if(a > target) {
				System.out.println("�ʹ� Ů�ϴ�.");
			}	else if (a < target) {
					System.out.println("�ʹ� �۽��ϴ�.");			
				}
			System.out.println("��Ÿ�����ϴ�. ������ �ƴմϴ�.");
			System.out.println("�ٽ��Է����ּ���.");
			}
		}
	}


