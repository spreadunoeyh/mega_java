package ���������;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ���̹�ũ�Ѹ�2 {

	public static void min(String[] args) throws Exception {

		String[] code = { "005360", "005930", "068270" };
		String[] company = { "�𳪹�", "�Ｚ����", "��Ʈ����" };

		for (int i = 0; i < company.length; i++) {

			Document doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=" + code[i]).get();
			Elements elist = doc.select("span.blind");
			System.out.println(company[i]);
			System.out.println("--------------------");
			String today = elist.get(12).text();
			System.out.println("���� =" + today);

			String yes = elist.get(15).text();
			System.out.println("���� =" + yes);

			String high = elist.get(16).text();
			System.out.println("�� =" + high);

			String low = elist.get(20).text();
			System.out.println("���� =" + low);

			String vol = elist.get(18).text();
			System.out.println("�ŷ��� =" + vol);

		}

	}

}
