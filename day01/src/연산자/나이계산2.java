package 연산자;

import java.util.Date;

public class 나이계산2 {

	public static void main(String[] args) {
		int year = 2000;
		
		Date date = new Date();
		int thisyear = date.getYear() + 1900;
		
		int age = thisyear - year + 1;
		System.out.println("나의 나이는 " + age);
	}

}
