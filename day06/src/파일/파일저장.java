package ����;

import java.io.FileWriter;
import java.io.IOException;

public class �������� {

	public static void main(String[] args) throws Exception {
		
		//�ܺ��ڿ��� �����Ҷ�(����, ��Ʈ��ũ, db�� �ٷ궧)
		//������ ����ó�� �ؾ���.
		FileWriter file = new FileWriter("test.txt");
		file.write("hello java" + "\n");
		file.write("bye java" + "ln");
		file.close();
	}

}
