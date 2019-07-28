package ½ºÅÂÆ½;

public class µþ {
	
	public String name;
	public int age;
	static int wallet = 10000;
	
	public µþ(String name, int age) {
		wallet = wallet - 1000;
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "µþ [name=" + name + ", age=" + age + "]";
	}
	
	

}
