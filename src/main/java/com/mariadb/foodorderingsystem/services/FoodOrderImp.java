package com.mariadb.foodorderingsystem.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mariadb.foodorderingsystem.model.Customer;
import com.mariadb.foodorderingsystem.model.Food;
import com.mariadb.foodorderingsystem.model.FoodOrder;
import com.mariadb.foodorderingsystem.model.Waiter;

@Service
public class FoodOrderImp implements FoodOrderService{
	List<FoodOrder>foodOrderList=new ArrayList();

	@Override
	public Integer total(int id) {
		Food food=null;
		Waiter waiter=null;
		Customer custom=null;
		FoodOrder fdOrder=null;
		for(FoodOrder fOrder:foodOrderList){
			if(id==fOrder.getId()){
				food=fOrder.getFood();
				waiter=fOrder.getWaiter();
				custom=fOrder.getCustomer();
				fdOrder=fOrder;
			}
		}
		Integer price=food.getFoodPrice();
		Integer quantity=fdOrder.getQuantity();
		
		return(price*quantity);
	}

	@Override
	public FoodOrder getOrder(FoodOrder foodOrder) {
		foodOrderList.add(foodOrder);
		return foodOrder;
	}

	@Override
	public List<FoodOrder> getAllOrder() {
		return foodOrderList;
	}

}
