package ���������;

import java.util.Vector;

public class �÷����׽�Ʈ {

	public static void main(String[] args) {
		Vector list = new Vector();
		list.add("���� ��Ʈ��");
		list.add(100);
		list.add(11.22);
		list.add(true);
		
		System.out.println(list.size());
		list.remove(3);
		System.out.println(list.size());
		
		for (Object o : list) {
			System.out.println(o);
			
			
		}
	}

}
