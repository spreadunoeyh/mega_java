package 생성자;

public class Account {
	String no; // 계좌번호
	String name; // 계좌주
	int total; // 입금액

	public Account(String no, String name, int total) {
		this.no = no;
		this.name = name;
		this.total = total;
	}

	public String toString() {
		return no + "  " + name + "  " + total; 
	}
	
}
