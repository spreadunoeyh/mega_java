package ����ƽ;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class ���뵷2 {

	int dongCount, soonCount;

	public ���뵷2() {
		JFrame f = new JFrame("�� �뵷 �׷���");
		f.getContentPane().setBackground(new Color(204, 204, 255));
		f.setSize(480, 400);

		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);

		JLabel l1 = new JLabel("�� �̸� : ");
		l1.setFont(new Font("����", Font.BOLD, 15));
		JLabel l2 = new JLabel("�� ���� : ");
		l2.setFont(new Font("����", Font.BOLD, 15));
		JLabel l3 = new JLabel("�ƺ� ���� �ܾ� ");
		l3.setFont(new Font("����", Font.PLAIN, 15));
		JLabel l4 = new JLabel("10000��");
		l4.setFont(new Font("����", Font.PLAIN, 15));

		JTextField name = new JTextField(10);
		name.setFont(new Font("����", Font.PLAIN, 15));
		JTextField age = new JTextField(10);
		age.setFont(new Font("����", Font.PLAIN, 15));

		JButton daddy = new JButton("�ƺ� �뵷 �ּ���");
		JTextArea list = new JTextArea(15,20);
		JTextArea list2 = new JTextArea(15,20);
		
		daddy.setForeground(Color.WHITE);
		daddy.setFont(new Font("����", Font.BOLD, 15));
		daddy.setBackground(new Color(0, 0, 102));
		daddy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = name.getText();
				String s2 = age.getText();
				int agei = Integer.parseInt(s2);

				�� ��1 = new ��(s1, agei);
				int result = ��.wallet;
				l4.setText(result + " ��");
								
				JOptionPane.showMessageDialog(null, ��1);
				
				if(s1.equals("ȫ�浿")) {
					dongCount++;
					list2.append("ȫ�浿�� �� " + (dongCount*1000) + " �� �� �޾ҽ��ϴ�.\n");
				}else if(s1.equals("ȫ���")) {
					soonCount++;
					list2.append("ȫ����� �� " + (soonCount*1000) + " �� �� �޾ҽ��ϴ�.\n");	
				}else {
					System.out.println("�� �̸� ����");
				}
								
				list.append(��1 + "\n");
				
				FileWriter file;
				try {
					file = new FileWriter("c:/temp/" + s1 + ".txt");
				
					file.write("�� �̸��� : " + s1 + "\n");
					file.write("�� ���̴� : " + s2 + "\n");
					file.close();
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				

				
				// 1. ���ϻ���(:c:/temp/" + s1 + ".txt")
				// 2. ���̸� �� ���� ����
				// 3. ����ó��(try catch)
				

	
			}
			

		
		});

		f.getContentPane().add(l1);
		f.getContentPane().add(name);
		f.getContentPane().add(l2);
		f.getContentPane().add(age);
		f.getContentPane().add(daddy);
		f.getContentPane().add(l3);
		f.getContentPane().add(l4);
		f.getContentPane().add(list);
		f.getContentPane().add(list2);

		f.setVisible(true);

	}

	public static void main(String[] args) {
		���뵷2 name = new ���뵷2();

	}

}
