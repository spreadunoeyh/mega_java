package 생성자;

public class Myroom2 {

	public static void main(String[] args) {
		//멤버변수값을 객체생성시 자동으로 넣고싶으면 생성자 메소드 클래스 이름과 동일하게 만들어주면 자동 호출
		
		Tv tv1 = new Tv(100, 10, true);
		Tv tv2 = new Tv(200, 5, false);
		
		
		//멤버변수값을 프린트 하고 싶으면, toString()메소드를 재정의하면 된다.
		System.out.println(tv1);
		System.out.println(tv2);
		
		

	}

}
