package ������;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ���Ǳ׷���2 {

	boolean check = false;

	public ���Ǳ׷���2() {

		JFrame f = new JFrame("��ī��");
		f.setSize(300, 400);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);

		JLabel label = new JLabel();
		label.setText("��ī�� ��ȭ");
		f.getContentPane().add(label);

		JButton push = new JButton("���� ������");
		JButton img = new JButton();

		ImageIcon icon = new ImageIcon("pika.jpg");

		img.setIcon(icon);

		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("��ư�� ��������.");
				if (check == false) {
					ImageIcon icon2 = new ImageIcon("rai.png");
					img.setIcon(icon2);
					label.setText("������");
					check = true;
				} else {
					img.setIcon(icon);
					label.setText("��ī��");
					check = false;
				}

			}
		});

		f.getContentPane().add(push);
		f.getContentPane().add(img);

		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		f.getContentPane().add(t1);
		f.getContentPane().add(t2);

		JButton push2 = new JButton("���� ����� Ȯ��");
		JLabel result = new JLabel("����� ���");
		push2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
				
				
				result.setText(i1+i2+"");
			}
		});
		f.getContentPane().add(push2);

		f.getContentPane().add(result);
		

		f.setVisible(true);
	}

	public static void main(String[] args) {
		���Ǳ׷���2 name = new ���Ǳ׷���2();
	}
}
