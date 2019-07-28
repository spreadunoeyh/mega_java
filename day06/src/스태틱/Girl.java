package ½ºÅÂÆ½;

public class Girl {

	String name;
	int tall;
	static int wallet = 10000;

	public Girl(String name, int tall) {
		wallet = wallet - 1000;
		this.name = name;
		this.tall = tall;
		
		
	}

	@Override
	public String toString() {
		return "Girl [name=" + name + ", tall=" + tall + "]";
	}

}
