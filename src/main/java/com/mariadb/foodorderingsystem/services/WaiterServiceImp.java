package com.mariadb.foodorderingsystem.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.mariadb.foodorderingsystem.model.Waiter;


@Service
public class WaiterServiceImp implements WaiterService{
	
	List<Waiter>waiterList=new ArrayList<>();
	
	@Override
	public Waiter findWaiterById(int id) {
		Waiter searchWaiter = null; 
		for(Waiter waiter:waiterList){
			if(id==waiter.getId()){
				searchWaiter=waiter;
			}
		}
		return searchWaiter;
	}

	@Override
	public List<Waiter> findWaiterByFirstName(String firstName) {
		List<Waiter>searchWaiterList=new ArrayList();
		for(Waiter waiter: waiterList){
			if(waiter.getFirstName().equalsIgnoreCase(firstName)){
				searchWaiterList.add(waiter);
			}
		}
		return searchWaiterList;
	}

	@Override
	public List<Waiter> getAllWaiter() {
		return waiterList;
	}

	@Override
	public Waiter addWaiter(Waiter waiter) {
		waiterList.add(waiter);
		return waiter;
	}

	@Override
	public Waiter deleteWaiter(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
