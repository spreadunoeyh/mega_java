package ����ƽ;

import javax.swing.JOptionPane;

public class ���̾�α� {
	
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "���� �޽���â");
		
		String age = JOptionPane.showInputDialog("���� �Է�");
		int agei = Integer.parseInt(age);
		System.out.println("���� ���̴� " + (agei + 1));
	}

}
