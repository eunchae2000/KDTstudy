package com.multi.mvc200;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {
	
	@RequestMapping("movie")
	public String movie(String movie) {
		System.out.println("영화 장르는 " + movie);
		if(movie.equals("드라마")) {
			return "drama"; 
			// drama라는 String 리턴을 받은 스프링은 views 아래에 가서 drama.jsp를 호출한다.
		}else if(movie.equals("액션")) {
			return "action";
		}else if(movie.equals("코믹")) {
			return "comic";
		}else {
			return "no";
		}
	}

}
