package ����ƽ;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class ���뵷 {

	public ���뵷() {
		JFrame f = new JFrame("�� �뵷 �׷���");
		f.setSize(200, 300);
		
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JLabel l1 = new JLabel("�� �̸� : ");
		l1.setFont(new Font("����", Font.PLAIN, 15));
		JLabel l2 = new JLabel("�� ���� : ");
		l2.setFont(new Font("����", Font.PLAIN, 15));
		JLabel l3 = new JLabel("�ƺ� ���� �ܾ� ");
		l3.setFont(new Font("����", Font.PLAIN, 15));
		JLabel l4 = new JLabel("10000��");
		l4.setFont(new Font("����", Font.PLAIN, 15));
		
		JTextField name = new JTextField(10);
		name.setFont(new Font("����", Font.PLAIN, 15));
		JTextField age = new JTextField(10);
		age.setFont(new Font("����", Font.PLAIN, 15));
		
		JButton daddy = new JButton("�ƺ� �뵷 �ּ���");
		daddy.setForeground(Color.WHITE);
		daddy.setFont(new Font("����", Font.PLAIN, 15));
		daddy.setBackground(new Color(0, 0, 102));
		daddy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = name.getText();
				String s2 = age.getText();
				int agei = Integer.parseInt(s2);
				
				�� ��1 = new ��(s1, agei);
				int result = ��.wallet;
				l4.setText(result+" ��");
				

			
				JOptionPane.showMessageDialog(null,��1);
				
			}
		});
		
f.getContentPane().add(l1);
f.getContentPane().add(name);
f.getContentPane().add(l2);
f.getContentPane().add(age);
f.getContentPane().add(daddy);
f.getContentPane().add(l3);
f.getContentPane().add(l4);


	
		
		f.setVisible(true);

	}

	public static void main(String[] args) {
		���뵷 name = new ���뵷();

	}

}
