package com.zun.entity;

public class Department {

	private String name;
	private String level;
	private String desc;
	private String id;
	
	
	public Department(String name, String level, String desc, String id) {
		super();
		this.name = name;
		this.level = level;
		this.desc = desc;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	
}
