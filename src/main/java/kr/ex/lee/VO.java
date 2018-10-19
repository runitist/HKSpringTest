package kr.ex.lee;

public class VO {
	private int bid;
	private String btitle;
	private String bcontent;
	
	public VO(){
		
	}
	public VO(int bid, String btitle, String bcontent){
		setBid(bid);
		setBtitle(btitle);
		setBcontent(bcontent);
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public String getBcontent() {
		return bcontent;
	}

	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}
	
	
}
