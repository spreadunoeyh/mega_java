package ����;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ��������3 {


	
	public static void main(String[] args) throws Exception {
	
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("�� �̸� :");		
		String d1 = sc.next();
		System.out.print("�� ���� :");		
		String d2 = sc.next();
		System.out.print("�� �б� :");		
		String d3 = sc.next();
		
		FileWriter file = new FileWriter(d1 + ".txt");	


		file.write("--------------" + "\n");		
		file.write("�� �̸� " + d1 + "\n");
		file.write("���� " + d2 + "\n");
		file.write("�б� " + d3 + "\n");
		file.write("--------------" + "\n");	
		file.close();

	}

}
