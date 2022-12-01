package db_connect;

public class ProductVO {
	private String ID;
	private String NAME;
	private String CONTENT;
	private int PRICE;
	private String COMAPNY;
	private String IMG;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getCONTENT() {
		return CONTENT;
	}
	public void setCONTENT(String cONTENT) {
		CONTENT = cONTENT;
	}
	public int getPRICE() {
		return PRICE;
	}
	public void setPRICE(int pRICE) {
		PRICE = pRICE;
	}
	public String getCOMAPNY() {
		return COMAPNY;
	}
	public void setCOMAPNY(String cOMAPNY) {
		COMAPNY = cOMAPNY;
	}
	public String getIMG() {
		return IMG;
	}
	public void setIMG(String iMG) {
		IMG = iMG;
	}
	@Override
	public String toString() {
		return "ProductVO [ID=" + ID + ", NAME=" + NAME + ", CONTENT=" + CONTENT + ", PRICE=" + PRICE + ", COMAPNY="
				+ COMAPNY + ", IMG=" + IMG + "]";
	}

	
}
