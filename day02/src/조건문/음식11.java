package 조건문;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 음식11 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1300, 500);
		
		JButton btnNewButton = new JButton("\uBA54\uB274\uD310\uC785\uB2C8\uB2E4");
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JButton button = new JButton("\uC9DC\uC7A5");
		button.setIcon(new ImageIcon("D:\\kimhnu\\day02\\\uBE44\uBE48.jpg"));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("짜장먹으러가요.");

			}
		});
		f.getContentPane().add(button, BorderLayout.WEST);
		
		JButton button_1 = new JButton("\uC9EC\uBF55");
		button_1.setIcon(new ImageIcon("D:\\kimhnu\\day02\\\uC9EC\uBF55.jpg"));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("짬뽕먹으러가요.");
			}
		});
		f.getContentPane().add(button_1, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("\uC6B0\uB3D9");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("우동먹으러가요.");
			}
		});
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		
		f.setVisible(true);
	}

}
