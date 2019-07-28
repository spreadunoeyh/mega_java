package 생성자;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Movie {

	
	int select;
	
	public static void main(String[] args) {

		JFrame m = new JFrame("나의 영화 앨범");
		m.setSize(400,550);
		FlowLayout flow = new FlowLayout();
		m.getContentPane().setLayout(flow);
		
		ImageIcon m1 = new ImageIcon("aladin.jpg");
		ImageIcon m2 = new ImageIcon("toy.jpg");
		ImageIcon m3 = new ImageIcon("lionking.jpg");
		
		JButton a1 = new JButton();
		m.getContentPane().add(a1);
		a1.setIcon(m1);
		
		JButton b1 = new JButton("알라딘");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a1.setIcon(m1);			}
		});
		JButton b2 = new JButton("토이스토리");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a1.setIcon(m2);
			}
		});
		JButton b3 = new JButton("라이온킹");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a1.setIcon(m3);
			}
		});
		m.getContentPane().add(b1);
		m.getContentPane().add(b2);
		m.getContentPane().add(b3);
			
		m.setVisible(true);
		
	}

}
