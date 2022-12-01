package book;

public class memberVO {
	private String member_id;
	private String member_pw;
	private String member_name;
	private String member_age;
	private boolean member_mr;
	
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getMember_pw() {
		return member_pw;
	}
	public void setMember_pw(String member_pw) {
		this.member_pw = member_pw;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public String getMember_age() {
		return member_age;
	}
	public void setMember_age(String member_age) {
		this.member_age = member_age;
	}
	public boolean isMember_mr() {
		return member_mr;
	}
	public void setMember_mr(boolean member_mr) {
		this.member_mr = member_mr;
	}
	public int getMember_tm() {
		return member_tm;
	}
	public void setMember_tm(int member_tm) {
		this.member_tm = member_tm;
	}
	public boolean isMember_loan() {
		return member_loan;
	}
	public void setMember_loan(boolean member_loan) {
		this.member_loan = member_loan;
	}
	private int member_tm;
	private boolean member_loan;
}
