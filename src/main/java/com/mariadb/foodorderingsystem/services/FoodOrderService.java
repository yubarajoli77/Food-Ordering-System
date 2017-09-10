package com.mariadb.foodorderingsystem.services;

import java.util.List;

import com.mariadb.foodorderingsystem.model.FoodOrder;

public interface FoodOrderService {
	public FoodOrder getOrder(FoodOrder foodOrder);
	Integer total(int id);
	List<FoodOrder>getAllOrder();

}
