package 조건문;

import java.util.Random;

public class 로또번호 {

	public static void main(String[] args) {
       Random r = new Random();
       System.out.println(r.nextInt(10));
       System.out.println(r.nextInt(10));
       System.out.println(r.nextInt(10));
	}

}
