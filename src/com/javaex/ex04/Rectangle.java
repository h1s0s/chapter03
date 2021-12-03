package com.javaex.ex04;

public class Rectangle {

	//필드
	private int width;
	private int height;
	
	//생성자
	public Rectangle() {
		super();
	}
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	//메소드 g-s
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	//메소드 일반
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	//@Override
	/*public boolean equals(Object obj) {
		if(this.width == ((Rectangle)obj).width && this.height == ((Rectangle)obj).height) {
			return true;
		} else {
			return false;
		}*/
	}
	
	

