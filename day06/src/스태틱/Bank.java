package ����ƽ;

public class Bank {
	String product; // string�� null �� �ʱ�ȭ.
	String name;
	int money = 0; // �ڵ��ʱ�ȭ
	static int count; // ���¼� ī��Ʈ
	static int sum; // money ����

	public static void printCount() {
		System.out.println(count);
	}
	
	// ������
	public Bank(String product, String name, int money) {
	    count++;
	    
		this.product = product;
		this.name = name;
		this.money = money;
	}

	// ���(toString())
	public String toString() {
		return "Bank [product=" + product + ", name=" + name + ", money=" + money + "]";
	}

}
