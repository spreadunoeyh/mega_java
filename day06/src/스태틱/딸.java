package ����ƽ;

public class �� {
	
	public String name;
	public int age;
	static int wallet = 10000;
	
	public ��(String name, int age) {
		wallet = wallet - 1000;
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "�� [name=" + name + ", age=" + age + "]";
	}
	
	

}
