package 스태틱;

public class Car {
	int speed;  // 멤버변수 - 각 차별로 따로 복사예정
	static int count;   //누적
	
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
