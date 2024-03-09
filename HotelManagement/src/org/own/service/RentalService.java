
package org.own.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import org.own.entity.Customer;

public interface RentalService {
	ArrayList<Customer> customers = new ArrayList<>();
	LinkedHashMap<Integer, Customer> nac = new LinkedHashMap<Integer, Customer>();
	LinkedHashMap<Integer, Customer>ac = new LinkedHashMap<Integer, Customer>();
	LinkedHashMap<Integer, Customer>deluxe = new LinkedHashMap<Integer, Customer>();
	void info();
	void checkRoomsAvailable();
	void checkIn();
	void checkOut();
}
