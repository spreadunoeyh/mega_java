package �迭��ȭ;

import javax.swing.JOptionPane;

public class StaticTest {

	public static void main(String[] args) {
		
		String a = JOptionPane.showInputDialog("ù��° ���ڸ� �Է����ּ���");
		int n1 = Integer.parseInt(a);
		
		String b = JOptionPane.showInputDialog("�ι�° ���ڸ� �Է����ּ���");
		int n2 = Integer.parseInt(b);
		
		System.out.println("�� ���� ���� " + (n1 + n2));
		
		JOptionPane.showMessageDialog(null,"�� ���� ���� " + (n1 + n2));
	}
	


}
