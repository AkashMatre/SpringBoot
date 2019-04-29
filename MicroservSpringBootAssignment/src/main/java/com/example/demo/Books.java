package com.example.demo;

public class Books {

	int bid;
	String bname;
	String author;
	String avlbl;
	
	public Books(int bid, String bname, String author, String avlbl) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.author = author;
		this.avlbl = avlbl;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAvlbl() {
		return avlbl;
	}

	public void setAvlbl(String avlbl) {
		this.avlbl = avlbl;
	}
	
	
}
