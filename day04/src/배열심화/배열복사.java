package �迭��ȭ;

import java.util.Arrays;

public class �迭���� {

	public static void main(String[] args) {

		// ��������
		int n1 = 100;
		int n2 = n1;
		System.out.println(n1);
		System.out.println(n2);
		n1 = 200;
		System.out.println(n1);
		System.out.println(n2);

		// �迭����
		int[] n3 = {1,2};
		int[] n4 = n3;
		for (int x : n3) {
			System.out.println(x);			
		}
		for (int x : n4) {
			System.out.println(x);			
		}
		
		n3[0] = 99;
		for (int x : n3) {
			System.out.println(x);			
		}
		for (int x : n4) {
			System.out.println(x);			
		}
		
		System.out.println("---------------------");
		int[] n5 = {1,2};
		int[] n6 = n5.clone(); // ��������
		n5[0] = 99;
		for (int x : n5) {
			System.out.println(x);
		}
		for (int x : n6) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		
		int[] n7 = {22,88,77,55,66};
		Arrays.sort(n7);
		for (int x : n7) {
			System.out.println(x);			
		}
		
		
	}

}
