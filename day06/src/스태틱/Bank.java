package 스태틱;

public class Bank {
	String product; // string은 null 로 초기화.
	String name;
	int money = 0; // 자동초기화
	static int count; // 계좌수 카운트
	static int sum; // money 누적

	public static void printCount() {
		System.out.println(count);
	}
	
	// 생성자
	public Bank(String product, String name, int money) {
	    count++;
	    
		this.product = product;
		this.name = name;
		this.money = money;
	}

	// 출력(toString())
	public String toString() {
		return "Bank [product=" + product + ", name=" + name + ", money=" + money + "]";
	}

}
