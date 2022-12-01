package db_connect;

public class MovieVO {
	private String movie_id;
	private String movie_title;
	private String movie_genre;
	private String movie_img;
	private String movie_url;
	public String getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(String movie_id) {
		this.movie_id = movie_id;
	}
	public String getMovie_title() {
		return movie_title;
	}
	public void setMovie_title(String movie_title) {
		this.movie_title = movie_title;
	}
	public String getMovie_genre() {
		return movie_genre;
	}
	public void setMovie_genre(String movie_genre) {
		this.movie_genre = movie_genre;
	}
	public String getMovie_img() {
		return movie_img;
	}
	public void setMovie_img(String movie_img) {
		this.movie_img = movie_img;
	}
	public String getMovie_url() {
		return movie_url;
	}
	public void setMovie_url(String movie_url) {
		this.movie_url = movie_url;
	}
	@Override
	public String toString() {
		return "MovieVO [movie_id=" + movie_id + ", movie_title=" + movie_title + ", movie_genre=" + movie_genre
				+ ", movie_img=" + movie_img + ", movie_url=" + movie_url + "]";
	}

}
