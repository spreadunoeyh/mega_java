package 파일;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class 파일저장3 {


	
	public static void main(String[] args) throws Exception {
	
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("딸 이름 :");		
		String d1 = sc.next();
		System.out.print("딸 나이 :");		
		String d2 = sc.next();
		System.out.print("딸 학교 :");		
		String d3 = sc.next();
		
		FileWriter file = new FileWriter(d1 + ".txt");	


		file.write("--------------" + "\n");		
		file.write("딸 이름 " + d1 + "\n");
		file.write("나이 " + d2 + "\n");
		file.write("학교 " + d3 + "\n");
		file.write("--------------" + "\n");	
		file.close();

	}

}
