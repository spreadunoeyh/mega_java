package ����ƽ;

import javax.swing.JOptionPane;

public class ��Ʈ���� {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("�̸� �Է�");
		int dongCount = 0;
		int soonCount = 0;
		
		//�񱳿����ڴ� �⺻������Ÿ�� �� �񱳸�. (�⺻������ Ÿ��:����,�Ǽ�,����,boolean)
		if (name.equals("ȫ�浿")) {
			dongCount++;			
		}else if (name.equals("ȫ���")) {
			soonCount++;			
		}else {
			System.out.println("�ش� �� �̸� ����.");
		}
	}

}
