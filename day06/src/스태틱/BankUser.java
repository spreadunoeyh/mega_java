package ����ƽ;

public class BankUser {

	public static void main(String[] args) {
		Bank b1 = new Bank("û������", "��ƹ���",500);
		Bank b2 = new Bank("������", "��ƹ�����",30);
		Bank b3 = new Bank("��������", "�ھƹ���",100);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		System.out.println(b2.product + " ���忡�� " + b2.money + "����");
		System.out.println(b3.name + " ���忡�� " + b3.money + "����");
		
		int total = b1.money + b2.money + b3.money;
		//��ü���ݾ� static���� �߰� ���
		//��ü���ݰ��� static���� �߰� ���
		System.out.println("�츮�� ��ü ���ݾ��� " + Bank.sum + "����");
		System.out.println("�츮�� ��ü ���¼���" + Bank.count);
	}

}
