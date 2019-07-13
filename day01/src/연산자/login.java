package 연산자;

public class login {
	public static void main(String[] args) {
		int id = 1000; //회원가입
		int pw = 1111;
		int input = 1000; // 입력한id
		int input2 = 1111;
		if (id == input && pw == input2) {
			 System.out.println("로그인 ok");
		}else {
			System.out.println("로그인 not");
		}
	}
}
