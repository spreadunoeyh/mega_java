package ����ƽ;

public class Car {
	int speed;  // ������� - �� ������ ���� ���翹��
	static int count;   //����
	
	public static void printCount() {
		System.out.println(count);
	}
	
	public Car(int speed) {
		count++;
		this.speed = speed;
	}
	
	public void speedUp() {
		System.out.println("speedup---!!");		
		
	}
}
