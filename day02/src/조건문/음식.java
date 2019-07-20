package 조건문;

import java.util.Scanner;

public class 음식 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("먹고 싶은 음식 선택");
			System.out.print("분식,한식,일식  >> ");
			String food = sc.next();

			switch (food) {
			case "분식":
				System.out.println("분식집으로.");
				break;
			case "한식":
				System.out.println("한식집으로.");
				break;
			case "일식":
				System.out.println("일식집으로.");
				break;
			default:
				break;
			}
			
	}

}