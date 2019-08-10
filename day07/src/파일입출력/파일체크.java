package 파일입출력;

import java.io.File;

public class 파일체크 {

	public static void main(String[] args) {
		File file = new File("D:\\kimhnu\\day07");
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
String[] list = file.list();
for (String s : list) {
	System.out.println(s);
	
}
	}

}
