package 조건문;

import java.util.Date;

public class 조건문1 {

	public static void main(String[] args) {

		Date date = new Date();
		int hour = date.getHours();
				
		if (hour <= 12) {
			System.out.println("오전");
		} else {
			System.out.println("오후");
		}
	}

}
