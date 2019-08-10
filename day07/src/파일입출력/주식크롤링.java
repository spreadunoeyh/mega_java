package ���������;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import javax.swing.JTextArea;

public class �ֽ�ũ�Ѹ� {
	private JTextField code;

	public �ֽ�ũ�Ѹ�() {
		JFrame f = new JFrame("���� �ֽ� ũ�Ѹ�");
		
		JTextArea result = new JTextArea(10, 15);

		
		f.setSize(201, 463);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton b1 = new JButton("   \uBAA8\uB098\uBBF8   ");
		b1.setFont(new Font("����", Font.BOLD, 20));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				result.setText("");
				try {
					Document doc;
					doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=005360").get();
					Elements elist = doc.select("span.blind");
					String today = elist.get(12).text();
					System.out.println( today);

					String yesterday = elist.get(15).text();
					System.out.println("���� =" + yesterday);

					String high = elist.get(16).text();
					System.out.println("�� =" + high);

					String low = elist.get(20).text();
					System.out.println("���� =" + low);
					
					result.append("���� =" + today + "\n");
					result.append("���� =" + yesterday + "\n");
					result.append("�� ="+ high + "\n");
					result.append("���� =" + low + "\n");
					

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
		f.getContentPane().add(b1);

		JButton b2 = new JButton("  \uC0BC\uC131\uC804\uC790  ");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText("");
				try {
					Document doc;
					doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=005930").get();
					Elements elist = doc.select("span.blind");
					String today = elist.get(12).text();
					System.out.println(today);

					String yesterday = elist.get(15).text();
					System.out.println("���� =" + yesterday);

					String high = elist.get(16).text();
					System.out.println("�� =" + high);

					String low = elist.get(20).text();
					System.out.println("���� =" + low);
					
					result.append("���� =" + today + "\n");
					result.append("���� =" + yesterday + "\n");
					result.append("�� ="+ high + "\n");
					result.append("���� =" + low + "\n");
					

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		b2.setFont(new Font("����", Font.BOLD, 20));
		f.getContentPane().add(b2);

		JButton b3 = new JButton("  \uC140\uD2B8\uB9AC\uC628  ");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		b3.setFont(new Font("����", Font.BOLD, 20));
		f.getContentPane().add(b3);

		JLabel lblCode = new JLabel("Code");
		lblCode.setFont(new Font("����", Font.PLAIN, 20));
		f.getContentPane().add(lblCode);

		code = new JTextField();
		code.setFont(new Font("����", Font.PLAIN, 20));
		f.getContentPane().add(code);
		code.setColumns(10);

		JButton btnNewButton_3 = new JButton("\uD06C\uB864\uB9C1\uC2DC\uC791");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				result.setText("");
			
				try {
					Document doc;
					String c1 = code.getText();
					doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=" + c1).get();
					Elements elist = doc.select("span.blind");
					String today = elist.get(12).text();
					String yesterday = elist.get(15).text();
					String high = elist.get(16).text();
					String low = elist.get(20).text();
					
					result.append("���� =" + today + "\n");
					result.append("���� =" + yesterday + "\n");
					result.append("�� ="+ high + "\n");
					result.append("���� =" + low + "\n");
					

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					
			}
			}
		});
		f.getContentPane().add(btnNewButton_3);

		f.getContentPane().add(result);

		f.setVisible(true);
	}

	public static void main(String[] args) {
		�ֽ�ũ�Ѹ� name = new �ֽ�ũ�Ѹ�();

	}
}
