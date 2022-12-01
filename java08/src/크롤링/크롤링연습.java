package 크롤링;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import org.jsoup.Jsoup;

public class 크롤링연습 {

	public static void main(String[] args) {
		// 1. 사이트에 연결해서, html 문서를 다 가지고 오자.
		try {
			Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930").get();	
//			doc.select(".nav");  // class가 nav인 태그를 찾아서 묶어서 와줘!
//			Elements list = doc.select(".code");
//			System.out.println(list.size());
//			Element tag = list.get(0);
//			System.out.println(tag.text());  // <a>메일</a> 중에서 메일만 추출
			
			Elements list = doc.select(".first");
			System.out.println(list.size());
			Element tag = list.get(0);
			System.out.println(tag);
			for (int i = 0; i < list.size(); i++) {
				Element tag1 = list.get(i);
				System.out.println(tag1.text());
				
			}
			
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}

	}

}
