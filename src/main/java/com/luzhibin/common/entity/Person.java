package com.luzhibin.common.entity;

public class Person {
	private int pid;
	private String name;
	private int age;
	private String about;
	private String created;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	
	public Person(int pid, String name, int age, String about, String created) {
		super();
		this.pid = pid;
		this.name = name;
		this.age = age;
		this.about = about;
		this.created = created;
	}
	
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", age=" + age + ", about=" + about + ", created=" + created
				+ "]";
	}
	
}
