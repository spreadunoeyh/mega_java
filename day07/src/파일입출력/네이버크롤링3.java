package ���������;


import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ���̹�ũ�Ѹ�3 {

	

		public static void min(String[] args) throws Exception {

			Document doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=005360").get();
			Elements elist = doc.select("span.blind");
			System.out.println("--------------------");
			String today = elist.get(12).text();
			System.out.println("���� =" + today);

			String yes = elist.get(15).text();
			String high = elist.get(16).text();
			String low = elist.get(20).text();
			String vol = elist.get(18).text();

			System.out.println("���� =" + yes);
			System.out.println("�� =" + high);
			System.out.println("���� =" + low);
			System.out.println("�ŷ��� =" + vol);

		}


}
