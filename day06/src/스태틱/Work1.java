package ����ƽ;

public class Work1 {

	public static void main(String[] args) {

		Work w1 = new Work("ȫ�浿", 25, "��");
		Work w2 = new Work("��浿", 23, "��");
		
		System.out.println(w1);
		System.out.println(w2);
		
		System.out.println("���� �̸��� " + w1.name + ", ���̴� " + w1.age + ", ������ " + w1.gender);
		System.out.println("���� �̸��� " + w2.name + ", ���̴� " + w2.age + ", ������ " + w2.gender);
		System.out.println("�� �������� " + Work.count + "��");
		
		
		

	}
}
