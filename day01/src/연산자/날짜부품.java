package ������;

import java.util.Date;

public class ��¥��ǰ {

	public static void main(String[] args) {
		Date date = new Date();
		
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		
		System.out.println("���� �ð���: " + hour + "�� " + min + "�� " + sec + "��");
	
		int year = date.getYear() + 1990;
		int month = date.getMonth() + 1;
		int day = date.getDay(); // ����
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
	}

}
