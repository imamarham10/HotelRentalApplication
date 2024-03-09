package org.own.ServiceImplementation;

import java.util.LinkedHashMap;
import java.util.Scanner;

import org.own.entity.Address;
import org.own.entity.Customer;
import org.own.service.RentalService;

public class RentalServiceImplementation implements RentalService{
	Scanner sc = new Scanner(System.in);
	{
		for(int i=101;i<=108;i++) {
			nac.put(i, null);
		}
		for(int j=201;j<=205;j++) {
			ac.put(j, null);
		}
		for(int i=301;i<=303;i++) {
			deluxe.put(i, null);
		}
	}
	@Override
	public void info() {
		// TODO Auto-generated method stub

	}

	void checkRooms(LinkedHashMap<Integer, Customer>map, String type) {
		System.out.println("====="+ type + " Rooms=====");
		int count = 0;
		for(Integer roomNo: map.keySet()) {
			if(map.get(roomNo)==null) {
				System.out.println(roomNo+ " ");
			}
			count++;
		}
		if(count==0) {
			System.out.println("No "+ type+ " rooms available");
		}
	}
	@Override
	public void checkRoomsAvailable() {
		checkRooms(ac, "AC");
		checkRooms(nac, "Non AC");
		checkRooms(deluxe, "Deluxe");

	}

	private void allocate(LinkedHashMap<Integer, Customer>map, String roomType,double roomPrice)
	{
		System.out.println("Enter room number:");
		int roomNo = sc.nextInt();
		if(map.containsKey(roomNo) && map.get(roomNo) == null) {
			System.out.println("Enter customer details");
			System.out.println("Enter customer id:-");
			int id = sc.nextInt();
			System.out.println("Enter customer name:-");
			String name = sc.next();
			System.out.println("Enter customer phone:- ");
			long phone = sc.nextLong();
			System.out.println("Enter house number:- ");
			String houseNo = sc.next();
			System.out.println("Enter street name");
			String streetName = sc.next();
			System.out.println("Enter pincode");
			int pincode = sc.nextInt();
			Address a = new Address(houseNo,streetName,pincode);
			Customer c = new Customer(id,name,phone,a,roomType,roomPrice,roomNo);
			map.put(roomNo, c);
			customers.add(c);
			System.out.println(c.getName()+ " has been allocated room number "+c.getRoomNo());
			System.out.println(c.getName()+ " needs to pay " + c.getRoomPrice());
		}else {
			System.out.println("Invalid room no!");
		}
	}
	
	void allocate(LinkedHashMap<Integer, Customer>map) {
		
	}
	@Override
	public void checkIn() {
		
		System.out.println("====Check-In====");
		System.out.println("1. Ac\n2. Non Ac\n3. Deluxe");
		System.out.println("Enter the option:- ");		
		int op = sc.nextInt();
		switch(op) {
		case 1:allocate(ac, "AC", 2400);
		break;
		case 2:allocate(nac, "Non AC", 1200);
		break;
		case 3:allocate(deluxe, "Deluxe", 4000);
		break;
		default: System.out.println("Invalid Option");
		break;
		}
	
		
		
		// TODO Auto-generated method stub

	}

	@Override
	public void checkOut() {
		// TODO Auto-generated method stub
		
	}

}
