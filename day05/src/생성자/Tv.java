package ������;

public class Tv {
	
	// ����Ư¡ => �������
	int ch;
	int volume;
	boolean onOff;	
	
	// ������ - ��ü������ �ڵ����� ȣ��
	Tv(){
		System.out.println("��ü ������ ���� �ڵ����� ȣ��Ǿ��.");
	}
	
		public Tv(int c, int v, boolean o) {
		ch = c;
		volume = v;
		onOff = o;
	}
	
		// ����Ư¡ => ����޼ҵ�
	public void powerOn() {
		System.out.println("Tv�� �Ѵ�.");
	}
	public String powerOff() {
		return "�˾Ҿ� ���ٰ�";		
	}
	
	@Override //(������)
	public String toString() {
		return ch + ", " + volume + ", " + onOff;
	}
	
}
