package �迭;

import java.util.Scanner;

public class �迭5 {

	public static void main(String[] args) {

		int[] score = new int[5];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < score.length; i++) {
			System.out.print("���� �Է�>> ");
			int data = sc.nextInt();
			score[i] = data;
		}
		
		score[2] = 0;
				
		System.out.println("���� ���� ���");
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
	}
}
