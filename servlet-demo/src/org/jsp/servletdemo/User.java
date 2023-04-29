package org.jsp.servletdemo;

public class User {
	private int id, age;
	private String name, password;
	private long phone;
	public User(int id, int age, String name, String password, long phone) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.password = password;
		this.phone = phone;
	}
	public User() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
}
