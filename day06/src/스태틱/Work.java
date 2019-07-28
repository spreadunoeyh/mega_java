package ½ºÅÂÆ½;

public class Work {

	 String name;
	 int age;
	 String gender;
	 static int count;
	 
	public Work(String name, int age, String gender) {
		count++;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String toString() {
		return "Work [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	 
	
	 
	 
}
