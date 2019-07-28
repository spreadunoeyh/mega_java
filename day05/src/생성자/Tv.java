package 생성자;

public class Tv {
	
	// 정적특징 => 멤버변수
	int ch;
	int volume;
	boolean onOff;	
	
	// 생성자 - 객체생성시 자동으로 호출
	Tv(){
		System.out.println("객체 생성시 내가 자동으로 호출되어요.");
	}
	
		public Tv(int c, int v, boolean o) {
		ch = c;
		volume = v;
		onOff = o;
	}
	
		// 동적특징 => 멤버메소드
	public void powerOn() {
		System.out.println("Tv를 켜다.");
	}
	public String powerOff() {
		return "알았어 꺼줄게";		
	}
	
	@Override //(재정의)
	public String toString() {
		return ch + ", " + volume + ", " + onOff;
	}
	
}
