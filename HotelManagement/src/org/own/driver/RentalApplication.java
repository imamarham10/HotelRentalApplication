package org.own.driver;

import java.util.Scanner;

import org.own.ServiceImplementation.RentalServiceImplementation;
import org.own.service.RentalService;

public class RentalApplication {
	public static void main(String[] args) {
		System.out.println("==========Welcome to Room Rental Application==========");
		RentalService rs = new RentalServiceImplementation();
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("=====Menu=====");
			System.out.println("1. Info\n2. Rooms Available\n3. Check In\n4. Exit");
			int option = sc.nextInt();
			switch(option) {
			case 1: rs.info();
			break;
			case 2: rs.checkRoomsAvailable();
			break;
			case 3: rs.checkIn();
			break;
			case 4: System.out.println("Thank you for using room rental application!");
			System.out.println("Please visit again!");
			sc.close();
			System.exit(0);
			default: System.out.println("Invalid option selected");
			break;
			}
		}
	}
}
