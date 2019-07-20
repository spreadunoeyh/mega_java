package Á¶°Ç¹®;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;

public class ³ªÀÇ±×·¡ÇÈ {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("³ªÀÇ Ã¹ ±×·¡ÇÈ");
		f.setSize(500, 500);
		
		JButton btnNewButton = new JButton("\uB098\uB97C \uB20C\uB7EC\uC694");
		btnNewButton.setForeground(new Color(153, 0, 153));
		btnNewButton.setBackground(new Color(153, 204, 255));
		btnNewButton.setFont(new Font("±¼¸²", Font.BOLD, 25));
		f.getContentPane().add(btnNewButton, BorderLayout.CENTER);

		JButton btnNewButton_1 = new JButton("\uC704\uC5D0 \uC788\uB294 \uBC84\uD2BC");
		btnNewButton_1.setBackground(new Color(255, 255, 204));
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setFont(new Font("±¼¸²", Font.BOLD, 25));
		f.getContentPane().add(btnNewButton_1, BorderLayout.NORTH);
		
		JButton btnNewButton_2 = new JButton("\uC67C\uCABD \uBC84\uD2BC");
		btnNewButton_2.setBackground(new Color(153, 255, 153));
		btnNewButton_2.setForeground(Color.BLUE);
		btnNewButton_2.setFont(new Font("±¼¸²", Font.BOLD, 25));
		f.getContentPane().add(btnNewButton_2, BorderLayout.WEST);
		
		JButton btnNewButton_3 = new JButton("\uC624\uB978\uCABD \uBC84\uD2BC");
		btnNewButton_3.setBackground(new Color(153, 153, 255));
		btnNewButton_3.setForeground(Color.BLUE);
		btnNewButton_3.setFont(new Font("±¼¸²", Font.BOLD, 25));
		f.getContentPane().add(btnNewButton_3, BorderLayout.EAST);
		
		JButton btnNewButton_4 = new JButton("\uC544\uB798 \uC788\uB294 \uBC84\uD2BC");
		btnNewButton_4.setBackground(new Color(153, 255, 204));
		btnNewButton_4.setForeground(Color.BLUE);
		btnNewButton_4.setFont(new Font("±¼¸²", Font.BOLD, 25));
		f.getContentPane().add(btnNewButton_4, BorderLayout.SOUTH);
		f.setVisible(true);
	}

}
