package ����ƽ;

public class Day {
	String doing;
	int time;
	String location;
	static int count;
	static int sum;
	
	//�������� ����
	public Day(String doing, int time, String location) {
		sum = sum + time;
		count++;
		System.out.println(count);
		this.doing = doing;
		this.time = time;
		this.location = location;
	}
	
	//�������� ���
	public String toString() {
		return doing + ", " + time + ", " + location;
	}
	
	
	
	
}
