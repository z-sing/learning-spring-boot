package com.pojo;

public class User {
	private Integer uid;
	private String uname;
	private String usex;
	private Idcard card;
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUsex() {
		return usex;
	}
	public void setUsex(String usex) {
		this.usex = usex;
	}
	public Idcard getCard() {
		return card;
	}
	public void setCard(Idcard card) {
		this.card = card;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", usex=" + usex + ", card=" + card + "]";
	}
	
	
}
