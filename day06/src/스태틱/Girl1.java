package ����ƽ;

public class Girl1 {

	public static void main(String[] args) {

		Girl g1 = new Girl("ȫ�浿", 100);
		
		System.out.println("���� �̸���" + g1.name);
		System.out.println("������ ���� �ݾ���" + Girl.wallet);
		
		Girl g2 = new Girl("ȫ���", 85);
		System.out.println("������ ���� �ݾ���" + Girl.wallet);

	}
}
