package ������;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class food {
	static int total = 0;

	public static void main(String[] args) {

		JLabel c1 = new JLabel("����");
		JLabel c2 = new JLabel("������ �� �ݾ�");

		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);

		JFrame m = new JFrame("���� �߱��� �޴���");
		m.setSize(500, 400);
		FlowLayout flow = new FlowLayout();
		m.getContentPane().setLayout(flow);

		ImageIcon i1 = new ImageIcon("jb.jpg");
		ImageIcon i2 = new ImageIcon("ud.jpg");
		ImageIcon i3 = new ImageIcon("jj.jpg");
		JButton f4 = new JButton();

		JButton f1 = new JButton("«��");
		f1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f4.setIcon(i1);
				total++;
				t1.setText(total + "��");
				t2.setText((total * 5000) + "��");
			}
		});
		JButton f2 = new JButton("�쵿");
		f2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f4.setIcon(i2);
				total++;
				t1.setText(total + "��");
				t2.setText((total * 5000) + "��");
			}
		});
		JButton f3 = new JButton("����");
		f3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f4.setIcon(i3);
				total++; //total = total + 1
				t1.setText(total + "��");
				t2.setText((total * 5000) + "��");
			}
		});

		f4.setIcon(i1);

		m.getContentPane().add(f1);
		m.getContentPane().add(f2);
		m.getContentPane().add(f3);
		m.getContentPane().add(c1);
		m.getContentPane().add(t1);
		m.getContentPane().add(f4);
		m.getContentPane().add(c2);
		m.getContentPane().add(t2);

		m.setVisible(true);
	}

}
