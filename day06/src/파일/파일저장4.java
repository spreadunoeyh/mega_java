package 파일;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class 파일저장4 {

	public static void main(String[] args) throws Exception {
		FileWriter file = new FileWriter("test2.txt");
		
		Scanner sc = new Scanner(System.in);

				
		for (int i = 0; i < 3; i++) {
			String data = JOptionPane.showInputDialog("입력데이터");
			
			file.write(data + "\n");
			
		}
		
		file.close();
		
	}

}
