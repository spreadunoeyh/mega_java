package ������;

public class Myroom {

	public static void main(String[] args) {

		// new -> ��ü���� tv1, tv2
		// ��ü������ ��������� ���簡 �ȴ�.
		// �� ��������� ���� ����־�� �Ѵ�.
		// ������ - ��ü������ ���ÿ� ����������� �Ѳ����� ���� �־��ִ� Ư���� �޼ҵ�.
		Tv tv1 = new Tv();
		Tv tv2 = new Tv();
		// �ּҰ� ���
		System.out.println(tv1);
		System.out.println(tv2);

		tv1.ch = 100;
		tv1.volume = 10;
		tv1.onOff = true;

		tv2.ch = 200;
		tv2.volume = 5;
		tv2.onOff = false;		

		tv1.powerOff();
		tv2.powerOn();
		
		System.out.println(tv1.ch);
		System.out.println(tv1.volume);
		System.out.println(tv1.onOff);
		System.out.println(tv2.ch);
		System.out.println(tv2.volume);
		System.out.println(tv2.onOff);
		

	}

}
