package 클래스기본;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;

public class 카운터 {

	static int count = 0;
	private static JTextField t1;
	private static JTextField t2;
	
	public static void main(String[] args) {
		//프레임부품 1
		
		JLabel result = new JLabel("0");
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(204, 204, 255));
		f.getContentPane().setFont(new Font("굴림", Font.PLAIN, 99));
		f.setTitle("나의 카운터");
		f.setSize(345, 654);		
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_1 = new JLabel("숫자1");
		f.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setForeground(new Color(0, 102, 204));
		t1.setFont(new Font("굴림", Font.PLAIN, 35));
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("숫자2");
		f.getContentPane().add(lblNewLabel_2);
		
		t2 = new JTextField();
		t2.setForeground(new Color(51, 102, 153));
		t2.setFont(new Font("굴림", Font.PLAIN, 35));
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\kimhnu\\day04\\counter.jpg"));
		f.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("-");
		btnNewButton.setBackground(new Color(204, 153, 204));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("- 를 누르셨군요.");
				
				String s1 = t1.getText();
				String s2 = t2.getText();
				System.out.println(s1 + "," + s2);
			
				// 모든 입력값은 다 string-> int로 변환.
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				
				
				// +연산
				int n3 = n1 - n2;
				
				//result 에 결과값 넣어줌
							
				
				//count++;
				result.setText(n3+"");
				//count--;
				
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 99));
		f.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("0");
		button.setBackground(new Color(153, 153, 204));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("0 를 누르셨군요.");
				count = 0;
				result.setText(0+"");
				t1.setText("");
				t2.setText("");
				
			}
		});
		button.setFont(new Font("굴림", Font.BOLD, 99));
		f.getContentPane().add(button);
		
		JButton button_1 = new JButton("+");
		button_1.setBackground(new Color(51, 153, 255));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("+ 를 누르셨군요.");
				
				//두 개의 숫자값을 가지고 와야한다.
				String s1 = t1.getText();
				String s2 = t2.getText();
				System.out.println(s1 + "," + s2);
			
				// 모든 입력값은 다 string-> int로 변환.
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				
				
				// +연산
				int n3 = n1 + n2;
				
				//result 에 결과값 넣어줌
							
				
				//count++;
				result.setText(n3+"");
				
			}			
			
		});
		button_1.setFont(new Font("굴림", Font.BOLD, 99));
		f.getContentPane().add(button_1);
		

		result.setForeground(new Color(153, 0, 0));
		result.setFont(new Font("굴림", Font.BOLD, 99));
		f.getContentPane().add(result);
		
		
		//배치부품 1
		
		//라벨(이미지, 글자) 부품 2
		//이미지부품 1
		//버튼부품 3

		
		f.setVisible(true);

	}

}
