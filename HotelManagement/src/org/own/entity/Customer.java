package org.own.entity;

public class Customer {
	private int id;
	private String name;
	private long phone;
	private Address a;
	private String roomType;
	private double roomPrice;
	private int roomNo;
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public double getRoomPrice() {
		return roomPrice;
	}
	public void setRoomPrice(double roomPrice) {
		this.roomPrice = roomPrice;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public Address getA() {
		return a;
	}
	public void setA(Address a) {
		this.a = a;
	}
	
	public Customer(int id, String name, long phone, Address a, String roomType, double roomPrice, int roomNo) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.a = a;
		this.roomType = roomType;
		this.roomPrice = roomPrice;
		this.roomNo = roomNo;
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", phone=" + phone + ", a=" + a + ", roomType=" + roomType
				+ ", roomPrice=" + roomPrice + ", roomNo=" + roomNo;
	}
	
	
}
