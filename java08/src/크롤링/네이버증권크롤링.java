package 크롤링;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링 {

	public static void main(String[] args) {
		String site = "http://finance.naver.com/item/main.nhn?code=";
		String[] name = { "삼성전자", "삼성SDS", "카카오" };
		String[] code = { "005930", "018920", "035720" };
		for (int i = 0; i < name.length; i++) {
			try {
				Document doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=" + code[i]).get();
				System.out.println("-------------");
				System.out.println("회사명: " + name[i]);
				System.out.print("오늘가: ");
				System.out.print(doc.select("p.no_today").text());
				System.out.print(doc.select("td.first").text());

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
