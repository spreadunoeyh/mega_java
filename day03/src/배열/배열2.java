package 배열;

public class 배열2 {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5 };
		System.out.println(num[0]);
		System.out.println(num[3]);
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num);
		}
		double[] eye = { 0.5, 0.6, 1.0, 2.0, 0.8 };
		System.out.println(eye[2]);
		for (int i = 0; i < eye.length; i++) {
			System.out.println(eye[i]);
		}
		// 배열은 위치값을 가지고 접근
		// 위치값=index
		// index는 0부터 시작
		// index의 마지막값은 개수-1

		System.out.println(eye.length);

		String[] name = { "홍길동", "김모", "이모", "박모", "최모" };
		System.out.println(name[0]);
		System.out.println(name[4]);
		System.out.println(name.length);
		
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
			
		}
		
		char[] gender = {'남' , '여'};
		System.out.println(gender[0]);
		
		for (int i = 0; i < gender.length; i++) {
			System.out.println(i + ": " + gender[i]);
			
		}

	}

}
