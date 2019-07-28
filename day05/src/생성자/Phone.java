package 생성자;

public class Phone {
	String color;
	int size;
	
	//객체생성시 자동호출
	//생성자(constructor) 메소드
	//입력값이 없는 생성자 : 기본생성자 - 자동으로 만들어줌.
	public Phone() {
		//System.out.println("내가 자동 호출됨");
	}
	
	public Phone(String color, int size){
		this.color = color;
		this.size = size;
	}
	
	@Override
	public String toString() {
		return color + ", " + size;
	}

	
	
	
}
