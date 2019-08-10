package 파일입출력;

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

public class 주식크롤링 {
	private JTextField code;

	public 주식크롤링() {
		JFrame f = new JFrame("나의 주식 크롤링");
		
		JTextArea result = new JTextArea(10, 15);

		
		f.setSize(201, 463);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton b1 = new JButton("   \uBAA8\uB098\uBBF8   ");
		b1.setFont(new Font("굴림", Font.BOLD, 20));
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
					System.out.println("전일 =" + yesterday);

					String high = elist.get(16).text();
					System.out.println("고가 =" + high);

					String low = elist.get(20).text();
					System.out.println("저가 =" + low);
					
					result.append("오늘 =" + today + "\n");
					result.append("전일 =" + yesterday + "\n");
					result.append("고가 ="+ high + "\n");
					result.append("저가 =" + low + "\n");
					

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
					System.out.println("전일 =" + yesterday);

					String high = elist.get(16).text();
					System.out.println("고가 =" + high);

					String low = elist.get(20).text();
					System.out.println("저가 =" + low);
					
					result.append("오늘 =" + today + "\n");
					result.append("전일 =" + yesterday + "\n");
					result.append("고가 ="+ high + "\n");
					result.append("저가 =" + low + "\n");
					

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		b2.setFont(new Font("굴림", Font.BOLD, 20));
		f.getContentPane().add(b2);

		JButton b3 = new JButton("  \uC140\uD2B8\uB9AC\uC628  ");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		b3.setFont(new Font("굴림", Font.BOLD, 20));
		f.getContentPane().add(b3);

		JLabel lblCode = new JLabel("Code");
		lblCode.setFont(new Font("굴림", Font.PLAIN, 20));
		f.getContentPane().add(lblCode);

		code = new JTextField();
		code.setFont(new Font("굴림", Font.PLAIN, 20));
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
					
					result.append("오늘 =" + today + "\n");
					result.append("전일 =" + yesterday + "\n");
					result.append("고가 ="+ high + "\n");
					result.append("저가 =" + low + "\n");
					

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
		주식크롤링 name = new 주식크롤링();

	}
}
