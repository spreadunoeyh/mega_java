package ������;

public class Phone {
	String color;
	int size;
	
	//��ü������ �ڵ�ȣ��
	//������(constructor) �޼ҵ�
	//�Է°��� ���� ������ : �⺻������ - �ڵ����� �������.
	public Phone() {
		//System.out.println("���� �ڵ� ȣ���");
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
