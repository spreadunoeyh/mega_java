package �迭��ȭ;

import javax.swing.JOptionPane;

public class StaticTest2 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "ȯ���մϴ�.");
		
		String name = JOptionPane.showInputDialog("�̸��� �Է��ϼ���");
		System.out.println("����� �̸��� " + name + "�Դϴ�.");
		
		String input = JOptionPane.showInputDialog("���� �Է�");
		int age = Integer.parseInt(input);
		System.out.println("���� ���̴� " + (age + 1));
		
		
	}
	


}
