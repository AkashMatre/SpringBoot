package com.example.demo;

public class User {
	
	int usrid;
	String uname;
	String addr;
	String mobno;
	
	public User(int usrid,String uname,String addr,String mobno){
		
	
		this.usrid = usrid;
		this.uname = uname;
		this.addr = addr;
		this.mobno = mobno;
		
	}
	
	public int getUsrid() {
		return usrid;
	}

	public void setUsrid(int usrid) {
		this.usrid = usrid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getMobno() {
		return mobno;
	}

	public void setMobno(String mobno) {
		this.mobno = mobno;
	}

	
	
}
