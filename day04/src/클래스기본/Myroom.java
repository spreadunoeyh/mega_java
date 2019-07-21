package 클래스기본;

public class Myroom {

	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.shape = "네모";
		p1.size = 9;
		
		p1.call();
		p1.katalk();
	
		Phone p2 = new Phone();
		p2.shape = "직사각형";
		p2.size = 11;
		p2.katalk();
		
		Dog d1 = new Dog();
		d1.color = "갈색";
		d1.age = 2;
		d1.move();		
		d1.bark();			
			
	}

}
