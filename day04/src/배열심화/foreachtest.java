package �迭��ȭ;

public class foreachtest {
	public static void main(String[] args) {
		int[] num = {10, 20, 30, 40, 50};
		System.out.println("ù��° num: " +  num[0]);
		System.out.println("�迭�� ����: " + num.length);
		System.out.println("�� ������ num" + num[num.length - 1]);
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			
		}
		for (int x : num) {
			System.out.println(x);
		}
		
		String[] names = {"ȫ�浿","��浿", "�ڱ浿"};
		for (int i = 0; i < names.length; i++) {
			System.out.println(i);
			
		}
		for (String s : names) {
			System.out.println(s);
			
		}
	}
}
