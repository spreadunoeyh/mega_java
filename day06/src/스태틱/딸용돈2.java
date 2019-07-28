package ½ºÅÂÆ½;

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

public class µþ¿ëµ·2 {

	int dongCount, soonCount;

	public µþ¿ëµ·2() {
		JFrame f = new JFrame("µþ ¿ëµ· ±×·¡ÇÈ");
		f.getContentPane().setBackground(new Color(204, 204, 255));
		f.setSize(480, 400);

		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);

		JLabel l1 = new JLabel("µþ ÀÌ¸§ : ");
		l1.setFont(new Font("±¼¸²", Font.BOLD, 15));
		JLabel l2 = new JLabel("µþ ³ªÀÌ : ");
		l2.setFont(new Font("±¼¸²", Font.BOLD, 15));
		JLabel l3 = new JLabel("¾Æºü Áö°© ÀÜ¾× ");
		l3.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		JLabel l4 = new JLabel("10000¿ø");
		l4.setFont(new Font("±¼¸²", Font.PLAIN, 15));

		JTextField name = new JTextField(10);
		name.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		JTextField age = new JTextField(10);
		age.setFont(new Font("±¼¸²", Font.PLAIN, 15));

		JButton daddy = new JButton("¾Æºü ¿ëµ· ÁÖ¼¼¿ä");
		JTextArea list = new JTextArea(15,20);
		JTextArea list2 = new JTextArea(15,20);
		
		daddy.setForeground(Color.WHITE);
		daddy.setFont(new Font("±¼¸²", Font.BOLD, 15));
		daddy.setBackground(new Color(0, 0, 102));
		daddy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = name.getText();
				String s2 = age.getText();
				int agei = Integer.parseInt(s2);

				µþ µþ1 = new µþ(s1, agei);
				int result = µþ.wallet;
				l4.setText(result + " ¿ø");
								
				JOptionPane.showMessageDialog(null, µþ1);
				
				if(s1.equals("È«±æµ¿")) {
					dongCount++;
					list2.append("È«±æµ¿ÀÌ ÃÑ " + (dongCount*1000) + " ¿ø À» ¹Þ¾Ò½À´Ï´Ù.\n");
				}else if(s1.equals("È«±æ¼ø")) {
					soonCount++;
					list2.append("È«±æ¼øÀÌ ÃÑ " + (soonCount*1000) + " ¿ø À» ¹Þ¾Ò½À´Ï´Ù.\n");	
				}else {
					System.out.println("µþ ÀÌ¸§ ¾øÀ½");
				}
								
				list.append(µþ1 + "\n");
				
				FileWriter file;
				try {
					file = new FileWriter("c:/temp/" + s1 + ".txt");
				
					file.write("µþ ÀÌ¸§Àº : " + s1 + "\n");
					file.write("µþ ³ªÀÌ´Â : " + s2 + "\n");
					file.close();
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				

				
				// 1. ÆÄÀÏ»ý¼º(:c:/temp/" + s1 + ".txt")
				// 2. µþÀÌ¸§ µþ ³ªÀÌ ÀúÀå
				// 3. ¿¡·¯Ã³¸®(try catch)
				

	
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
		µþ¿ëµ·2 name = new µþ¿ëµ·2();

	}

}
