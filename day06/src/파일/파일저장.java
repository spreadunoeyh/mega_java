package 파일;

import java.io.FileWriter;
import java.io.IOException;

public class 파일저장 {

	public static void main(String[] args) throws Exception {
		
		//외부자원을 연결할때(파일, 네트워크, db를 다룰때)
		//무조건 에러처리 해야함.
		FileWriter file = new FileWriter("test.txt");
		file.write("hello java" + "\n");
		file.write("bye java" + "ln");
		file.close();
	}

}
