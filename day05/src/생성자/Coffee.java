package 생성자;

public class Coffee {

	int price;
	String menu;
	
	public void coffee() {
		System.out.println("커피");
	}
	
	public void coffee(int price) {
		System.out.println("커피 가격은" + price + "입니다.");
		
	}
	
	public void coffee(int price, String menu) {
		System.out.println("커피 가격은" + price + ", 메뉴는 " + menu + " 입니다.");
		
	}
	
}
