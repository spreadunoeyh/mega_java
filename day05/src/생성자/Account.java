package ������;

public class Account {
	String no; // ���¹�ȣ
	String name; // ������
	int total; // �Աݾ�

	public Account(String no, String name, int total) {
		this.no = no;
		this.name = name;
		this.total = total;
	}

	public String toString() {
		return no + "  " + name + "  " + total; 
	}
	
}
