package 배열;

import java.util.Scanner;

public class Seat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("영화 예매 프로그램 입니다.");
		
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
		System.out.print("예매를 원하는 좌석번호 입력(종료:0) >> ");
		int p = sc.nextInt();
		
			seat[p] = 1;
			
			for (int i = 0; i < seat.length; i++) {		
			System.out.print(seat[i] + " ");
		}
			System.out.println();
			System.out.println(p + " 번 좌석이 예매 되었습니다.");
		
		//5,6번자리 예매처리
		// 0->1로 저장
		// 모든자리 상황 프린트
	}

}
