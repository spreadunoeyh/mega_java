package ���������;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class �ϱ��� {
	private JTextField t1;
	private JTextField t2;

	public �ϱ���() {
		JFrame f = new JFrame("���� �ϱ��� �ۼ�");
		f.getContentPane().setBackground(new Color(176, 224, 230));
		f.setSize(500,440);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("<<\uC77C\uAE30\uC791\uC131\uB0A0\uC9DC>>");
		lblNewLabel.setForeground(new Color(25, 25, 112));
		lblNewLabel.setFont(new Font("����", Font.BOLD, 15));
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setBackground(new Color(255, 235, 205));
		t1.setFont(new Font("����", Font.PLAIN, 15));
		f.getContentPane().add(t1);
		t1.setColumns(28);
		
		JLabel lblNewLabel_1 = new JLabel("<<\uC77C\uAE30\uC791\uC131\uC81C\uBAA9>>");
		lblNewLabel_1.setForeground(new Color(25, 25, 112));
		lblNewLabel_1.setFont(new Font("����", Font.BOLD, 15));
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setBackground(new Color(255, 235, 205));
		t2.setFont(new Font("����", Font.PLAIN, 15));
		f.getContentPane().add(t2);
		t2.setColumns(28);
		
		JLabel label = new JLabel("<<\uC77C\uAE30\uC791\uC131\uB0B4\uC6A9>>");
		label.setForeground(new Color(25, 25, 112));
		label.setFont(new Font("����", Font.BOLD, 15));
		f.getContentPane().add(label);
		
		JTextArea t3 = new JTextArea(15,40);
		t3.setBackground(new Color(255, 239, 213));
		f.getContentPane().add(t3);
		
		JButton b1 = new JButton("\uD30C\uC77C\uC5D0 \uC800\uC7A5\uD558\uAE30");
		b1.setBackground(new Color(32, 178, 170));
		b1.setForeground(new Color(0, 0, 128));
		b1.setFont(new Font("����", Font.BOLD, 18));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//1. ��¥�� �����ٰ� �����̸��� �����.
				String date = t1.getText();
				try {
					FileWriter file = new FileWriter(date+".txt");
					
					//2. ���Ͽ� ��¥, ����, ������ �����ؾ� �Ѵ�.

					String s2 = t2.getText();
					String s3 = t3.getText();
					
					file.write(date + " \n");
					file.write(s2 + " \n");
					file.write(s3 + " \n");
					
					//3. ���� ��Ʈ���� �ݾƾ� �Ѵ�.
					file.close();
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				

				
			}
		});
		f.getContentPane().add(b1);
		
		
		
		
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		�ϱ��� name = new �ϱ���();
	}

}
