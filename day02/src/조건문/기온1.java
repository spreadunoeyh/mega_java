package 조건문;

import java.util.Scanner;

public class 기온1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------");
		System.out.print("오늘의 기온은? ");
		String tem = sc.next();
		System.out.print("오늘 나의 평가는? ");
		String cri = sc.next();
		System.out.print("나의 신발 사이즈는? ");
		double shoe = sc.nextDouble();
		System.out.println("--------------");
				
		System.out.println("오늘은 " + tem + "도, 나의평가는 " 
		+ cri + ", 신발은" + shoe );	
		
		
		System.out.print("첫번째 숫자는? ");
		int first = sc.nextInt();
		System.out.print("두번째 숫자는? ");
		int seco = sc.nextInt();
		if (first == seco ) {
			System.out.println("두수가 같습니다.");			
		} else {
			System.out.println("두수가 다릅니다.");
		}
		
		System.out.print("받은돈: ");
		int money = sc.nextInt();
		System.out.print("상품의 총액: ");
		int price = sc.nextInt();
		System.out.println("부가세: " + (int)( price * 0.1) );
		System.out.println("잔돈: " + ( money - price ) );
		
				
	}
}
