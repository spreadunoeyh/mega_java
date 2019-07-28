package ½ºÅÂÆ½;

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

public class µþ¿ëµ· {

	public µþ¿ëµ·() {
		JFrame f = new JFrame("µþ ¿ëµ· ±×·¡ÇÈ");
		f.setSize(200, 300);
		
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JLabel l1 = new JLabel("µþ ÀÌ¸§ : ");
		l1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		JLabel l2 = new JLabel("µþ ³ªÀÌ : ");
		l2.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		JLabel l3 = new JLabel("¾Æºü Áö°© ÀÜ¾× ");
		l3.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		JLabel l4 = new JLabel("10000¿ø");
		l4.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		
		JTextField name = new JTextField(10);
		name.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		JTextField age = new JTextField(10);
		age.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		
		JButton daddy = new JButton("¾Æºü ¿ëµ· ÁÖ¼¼¿ä");
		daddy.setForeground(Color.WHITE);
		daddy.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		daddy.setBackground(new Color(0, 0, 102));
		daddy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = name.getText();
				String s2 = age.getText();
				int agei = Integer.parseInt(s2);
				
				µþ µþ1 = new µþ(s1, agei);
				int result = µþ.wallet;
				l4.setText(result+" ¿ø");
				

			
				JOptionPane.showMessageDialog(null,µþ1);
				
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
		µþ¿ëµ· name = new µþ¿ëµ·();

	}

}
