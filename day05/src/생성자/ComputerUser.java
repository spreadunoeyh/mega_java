package 생성자;

public class ComputerUser {

	public static void main(String[] args) {
		Computer com1 = new Computer(100, "애플");
		System.out.println(com1);
		
		Computer com2 = new Computer(200, "삼성");
		System.out.println(com2);
	}


}
