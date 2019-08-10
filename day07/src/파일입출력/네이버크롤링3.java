package 파일입출력;


import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버크롤링3 {

	

		public static void min(String[] args) throws Exception {

			Document doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=005360").get();
			Elements elist = doc.select("span.blind");
			System.out.println("--------------------");
			String today = elist.get(12).text();
			System.out.println("오늘 =" + today);

			String yes = elist.get(15).text();
			String high = elist.get(16).text();
			String low = elist.get(20).text();
			String vol = elist.get(18).text();

			System.out.println("전일 =" + yes);
			System.out.println("고가 =" + high);
			System.out.println("저가 =" + low);
			System.out.println("거래량 =" + vol);

		}


}
