package 스태틱;

public class BankUser {

	public static void main(String[] args) {
		Bank b1 = new Bank("청약저축", "김아무개",500);
		Bank b2 = new Bank("내비상금", "김아무개딸",30);
		Bank b3 = new Bank("자유적금", "박아무개",100);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		System.out.println(b2.product + " 통장에는 " + b2.money + "만원");
		System.out.println(b3.name + " 통장에는 " + b3.money + "만원");
		
		int total = b1.money + b2.money + b3.money;
		//전체예금액 static변수 추가 출력
		//전체예금개수 static변수 추가 출력
		System.out.println("우리집 전체 예금액은 " + Bank.sum + "만원");
		System.out.println("우리집 전체 계좌수는" + Bank.count);
	}

}
