package com.aaron.entity;

public class User {
	
	private String stname;

	public String getStname() {
		return stname;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}
	
	public void sayHello(){
		System.out.println("hello " + stname);
	}

}
