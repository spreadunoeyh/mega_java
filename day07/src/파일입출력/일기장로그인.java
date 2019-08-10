package 파일입출력;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 일기장로그인 {
	private JTextField t1;
	private JTextField t2;

	public 일기장로그인() {
		JFrame f = new JFrame("나의 일기장");
		f.getContentPane().setBackground(new Color(175, 238, 238));
		f.setBackground(new Color(102, 153, 255));
		f.getContentPane().setForeground(new Color(0, 51, 0));
		f.setSize(500, 450);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("D:\\kimhnu\\day07\\004.png"));
		f.getContentPane().add(label);
		JLabel lblId = new JLabel("ID \uC785\uB825");
		lblId.setForeground(new Color(0, 51, 51));
		lblId.setFont(new Font("굴림", Font.BOLD, 15));
		f.getContentPane().add(lblId);
		t1 = new JTextField();
		t1.setBackground(new Color(238, 232, 170));
		t1.setFont(new Font("굴림", Font.PLAIN, 15));
		f.getContentPane().add(t1);
		t1.setColumns(10);
		JLabel lblNewLabel = new JLabel("PW \uC785\uB825");
		lblNewLabel.setForeground(new Color(0, 51, 51));
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 15));
		f.getContentPane().add(lblNewLabel);
		t2 = new JTextField();
		t2.setBackground(new Color(238, 232, 170));
		t2.setFont(new Font("굴림", Font.PLAIN, 15));
		f.getContentPane().add(t2);
		t2.setColumns(10);
		JButton btnNewButton = new JButton("\uB85C\uADF8\uC778\uCC98\uB9AC");
		btnNewButton.setBackground(new Color(51, 153, 204));
		btnNewButton.setForeground(new Color(0, 51, 102));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s1 = t1.getText(); // 입력한 id
				String s2 = t2.getText(); // 입력한 pw
				System.out.println("입력 id " + s1);
				System.out.println("입력 pw " + s2);

				String id = "root";
				String pw = "1234";

				if (id.equals(s1) && pw.equals(s2)) {
					System.out.println("로그인ok");
					일기장 diary = new 일기장();
					JOptionPane.showMessageDialog(null, "파일 저장 성공");
					
				} else {
					System.out.println("로그인not");
					JOptionPane.showMessageDialog(null, "다시 로그인 해주세요");
					t1.setText("");
					t2.setText("");
				}


			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 24));
		f.getContentPane().add(btnNewButton);
		f.setVisible(true);
	}

	public static void main(String[] args) {

		일기장로그인 name = new 일기장로그인();

	}

}
