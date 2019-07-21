package 배열심화;

import javax.swing.JOptionPane;

public class StaticTest {

	public static void main(String[] args) {
		
		String a = JOptionPane.showInputDialog("첫번째 숫자를 입력해주세요");
		int n1 = Integer.parseInt(a);
		
		String b = JOptionPane.showInputDialog("두번째 숫자를 입력해주세요");
		int n2 = Integer.parseInt(b);
		
		System.out.println("두 수의 합은 " + (n1 + n2));
		
		JOptionPane.showMessageDialog(null,"두 수의 합은 " + (n1 + n2));
	}
	


}
