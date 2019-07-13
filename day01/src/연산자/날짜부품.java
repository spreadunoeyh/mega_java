package 연산자;

import java.util.Date;

public class 날짜부품 {

	public static void main(String[] args) {
		Date date = new Date();
		
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		
		System.out.println("현재 시각은: " + hour + "시 " + min + "분 " + sec + "초");
	
		int year = date.getYear() + 1990;
		int month = date.getMonth() + 1;
		int day = date.getDay(); // 요일
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
	}

}
