package 조건문;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class 그래픽이미지넣기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		JButton btnNewButton = new JButton("\uADF8\uB798\uD53D \uB123\uAE30");
		btnNewButton.setIcon(new ImageIcon("D:\\kimhnu\\day02\\103257_1.jpg"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("가위를 누르셨군요.");
				Random r = new Random();				
				int computer = r.nextInt(3);
				if (computer == 0) { //가위
					System.out.println("비겼음");
				}else if (computer == 1) {//바위
					System.out.println("컴퓨터 승");					
				}else if (computer == 2) {
					System.out.println("내가 승");
				}
			}
		});
		f.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("\uBCF4");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("보를 누르셨군요.");
				Random r = new Random();				
				int computer = r.nextInt(3);
				if (computer == 0) { //가위
					System.out.println("비겼음");
				}else if (computer == 1) {//바위
					System.out.println("컴퓨터 승");					
				}else if (computer == 2) {
					System.out.println("내가 승");
				}
			}
		});
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		
		JButton btnNewButton_2 = new JButton("\uBC14\uC704");
		btnNewButton_2.setIcon(new ImageIcon("D:\\kimhnu\\day02\\\uC8FC\uBA39.jpeg"));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("바위를 누르셨군요.");
				Random r = new Random();				
				int computer = r.nextInt(3);
				if (computer == 0) { //가위
					System.out.println("비겼음");
				}else if (computer == 1) {//바위
					System.out.println("컴퓨터 승");					
				}else if (computer == 2) {
					System.out.println("내가 승");
				}
			}			
		});
		f.getContentPane().add(btnNewButton_2, BorderLayout.WEST);
		f.setSize(500, 500);
		
		f.setVisible(true);
	}
}
