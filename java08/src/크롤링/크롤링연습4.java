package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링연습4 {

   public static void main(String[] args) {
      try {
         Document doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=005930").get();
         System.out.println("----------");
         System.out.println("회사명: 삼성전자");
         // 전일가
         Elements list = doc.select("td.first").select(".blind");
//         System.out.println(list);
         Element tag = list.get(0);
         System.out.println("전일가: "+tag.text());
//         System.out.println(tag.text());
         String yesterday = tag.text();
         
         //현재가
         Elements list2 = doc.select("div.today").select(".blind");
//         System.out.println(list2);
         Element tag2 = list2.get(0);
         System.out.println("전일가: "+tag2.text());
         String today = tag2.text();
         
         Elements list3 = doc.select("td.first").select(".blind");
         Element tag3 = list.get(1);
         System.out.println("시가: " + tag3.text());

         //고가
//         Elements list3 = doc.select("td.first").select(".blind");
//         System.out.println(list3);
//         Element tag3 = list3.get(1);
//         String market_price = tag3.text();
//         System.out.println(market_price);
         
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

}