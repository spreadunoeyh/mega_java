package ������;

import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ���Ǳ׷��� {

	public ���Ǳ׷���() {
		JFrame f = new JFrame("���� �׷���");
		f.setSize(800, 700);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		ImageIcon icon2 = new ImageIcon("pika.jpg");

		JButton b1 = new JButton();
		b1.setIcon(icon2);
		
		//add�� f(frame)�� �÷��ش�.
		f.add(b1);
		
		JButton b2 = new JButton("���� ��ư");
		f.add(b2);
		
		JButton b3 = new JButton("����° ��ư");
		f.add(b3);
		
		ImageIcon icon = new ImageIcon("005.png");
		
		JButton b4 = new JButton(icon);
		
		f.setVisible(true);
		
		f.add(b4);
		
		
		

		
	}
	
	
	public static void main(String[] args) {
		���Ǳ׷��� me = new ���Ǳ׷���();
	}

}
