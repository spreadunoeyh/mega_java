package 변수;

public class Me {

	public static void main(String[] args) {
		byte age;  //선언->메모리 공간 확보
		age = 100; //= => 할당연산자 , 대입연산자
		
		int money = 10;
		
		double weight = 100;
		float eye = 0.9F;
		
		char gender = '남';
		
		String name = "홍길동";
		
		boolean lunch = true; //false
		
		
		// + =결합연산자
		System.out.println("내 이름은: " + name);
		System.out.println("내 나이: " + age + "세");
		System.out.println("내 돈은: " + money + "원");
		System.out.println("내 몸무게는:" + weight);
		System.out.println("내 시력은: " + eye);
		System.out.println("내 성별은: " + gender);
		System.out.println("점심은 맛있게 드셨나요: " + lunch);
	}

}
