package 생성자;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의그래픽2 {

	boolean check = false;

	public 나의그래픽2() {

		JFrame f = new JFrame("피카츄");
		f.setSize(300, 400);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);

		JLabel label = new JLabel();
		label.setText("피카츄 진화");
		f.getContentPane().add(label);

		JButton push = new JButton("나를 눌러요");
		JButton img = new JButton();

		ImageIcon icon = new ImageIcon("pika.jpg");

		img.setIcon(icon);

		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("버튼을 눌렀군요.");
				if (check == false) {
					ImageIcon icon2 = new ImageIcon("rai.png");
					img.setIcon(icon2);
					label.setText("라이츄");
					check = true;
				} else {
					img.setIcon(icon);
					label.setText("피카츄");
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

		JButton push2 = new JButton("더한 결과값 확인");
		JLabel result = new JLabel("결과값 출력");
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
		나의그래픽2 name = new 나의그래픽2();
	}
}
