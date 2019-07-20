package 배열;

import java.util.Scanner;

public class 배열5 {

	public static void main(String[] args) {

		int[] score = new int[5];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < score.length; i++) {
			System.out.print("점수 입력>> ");
			int data = sc.nextInt();
			score[i] = data;
		}
		
		score[2] = 0;
				
		System.out.println("영어 점수 출력");
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
	}
}
