package 순차문;

import java.util.Scanner;

public class 기본입력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("프로그램이름 입력 ");
		String data = sc.next();
		System.out.println("입력값: " + data);
		
		
		
		System.out.println("=========");
		System.out.println("회원가입정보");
		System.out.println("---------");
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("아이디: ");
		String id = sc.next();
		System.out.print("비번: ");
		String pw = sc.next();
		System.out.print("연락처: ");
		String tel = sc.next();
		System.out.println("-----------");
		System.out.println(name + ", " + id + ", " + pw + ", " + tel);
		
		
	}
}
