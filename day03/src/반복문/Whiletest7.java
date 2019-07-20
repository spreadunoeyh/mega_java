package 반복문;

import java.util.Random;
import java.util.Scanner;

public class Whiletest7 {

	// ctrl + shift + f :코드정리

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int data2 = r.nextInt(100);
		int target = data2;
		int count = 0;
		
		while (true) {
			count++;
			System.out.print("생각한 숫자입력: ");
			int a = sc.nextInt();
			if (a == target) {
				System.out.println("축하합니다. 정답입니다.");
				System.out.println("당신이 시도한 횟수는: " + count + "번 입니다.");
				System.out.println("당신이 실패한 횟수는: " + (count-1) + "번 입니다.");
				break;
			} else if(a > target) {
				System.out.println("너무 큽니다.");
			}	else if (a < target) {
					System.out.println("너무 작습니다.");			
				}
			System.out.println("안타깝습니다. 정답이 아닙니다.");
			System.out.println("다시입력해주세요.");
			}
		}
	}


