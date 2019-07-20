package 조건문;

import java.util.Scanner;

public class abc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ABC 입력: ");
		String score = sc.next();
		char abc = score.charAt(0);
		System.out.println(abc);
		
		switch (abc) {
		case 'A':
			System.out.println("최우수입니다");
			break;
		case 'B':
			System.out.println("우수입니다");
			break;
		case 'C':
			System.out.println("보통입니다");
			break;
		default:
			System.out.println("통과하지 못했습니다.");
			break;
		}
				
	}

}
