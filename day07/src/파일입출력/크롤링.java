package ���������;

import java.io.IOException;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class ũ�Ѹ� {
public static void main(String[] args) throws Exception {
	
	
	Document doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=068270").get();
	Elements elist = doc.select("span.blind");
	String today = elist.get(12).text();
	System.out.println("���� :" + today);
	
}
}
