package com.mariadb.foodorderingsystem.services;

import java.util.List;

import com.mariadb.foodorderingsystem.model.Waiter;

public interface WaiterService {
	Waiter findWaiterById(int id);
	List<Waiter> findWaiterByFirstName(String firstName);
	List<Waiter> getAllWaiter();
	Waiter addWaiter(Waiter waiter);
	Waiter deleteWaiter(int id);
	
}
