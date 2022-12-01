package book;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class loanVO {
	private int loan_id;
	private Date loan_rental;
	private Date loan_return;
	private int loan_day;
	private int loan_bm;
	private int book_id;
	private String member_id;
	public int getLoan_id() {
		return loan_id;
	}
	public void setLoan_id(int loan_id) {
		this.loan_id = loan_id;
	}

	public Date getLoan_rental() {
		return loan_rental;
	}
	public void setLoan_rental(Date loan_rental) {
		this.loan_rental = loan_rental;
	}
	public Date getLoan_return() {
		return loan_return;
	}
	public void setLoan_return(Date loan_return) {
		this.loan_return = loan_return;
	}
	
	public int getLoan_day() {
		return loan_day;
	}
	public void setLoan_day(int loan_day) {
		this.loan_day = loan_day;
	}
	public int getLoan_bm() {
		return loan_bm;
	}
	public void setLoan_bm(int loan_bm) {
		this.loan_bm = loan_bm;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	

}
