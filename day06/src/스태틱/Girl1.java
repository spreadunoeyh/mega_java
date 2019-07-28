package 스태틱;

public class Girl1 {

	public static void main(String[] args) {

		Girl g1 = new Girl("홍길동", 100);
		
		System.out.println("딸의 이름은" + g1.name);
		System.out.println("지갑에 남은 금액은" + Girl.wallet);
		
		Girl g2 = new Girl("홍길순", 85);
		System.out.println("지갑에 남은 금액은" + Girl.wallet);

	}
}
