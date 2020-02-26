package com.bawei.pojo;

public enum StudentSex {
	
	女("女"),
	
	男("男");
	
	private String code;
	
	public String getCode() {
		return code;
	}
	
	private StudentSex(String code) {
		this.code = code;
	}
	
	public int getOrdinal() {
		return this.ordinal();
	}
	
	//获得常量的方法
	public String getName() {
		return this.name();
	}
}
