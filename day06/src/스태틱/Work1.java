package 스태틱;

public class Work1 {

	public static void main(String[] args) {

		Work w1 = new Work("홍길동", 25, "남");
		Work w2 = new Work("김길동", 23, "여");
		
		System.out.println(w1);
		System.out.println(w2);
		
		System.out.println("직원 이름은 " + w1.name + ", 나이는 " + w1.age + ", 성별은 " + w1.gender);
		System.out.println("직원 이름은 " + w2.name + ", 나이는 " + w2.age + ", 성별은 " + w2.gender);
		System.out.println("총 직원수는 " + Work.count + "명");
		
		
		

	}
}
