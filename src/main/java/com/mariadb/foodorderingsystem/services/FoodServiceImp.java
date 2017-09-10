package com.mariadb.foodorderingsystem.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mariadb.foodorderingsystem.model.Customer;
import com.mariadb.foodorderingsystem.model.Food;

@Service
public class FoodServiceImp implements FoodService{
	List<Food>foodList=new ArrayList();
	List<Food>food=new ArrayList();

	@Override
	public Food addFood(Food food) {
		foodList.add(food);
		return food;
	}

	@Override
	public List<Food> getFoodList() {
		return foodList;
	}

	@Override
	public Food findFoodByName(String foodName) {
		Food food= new Food();
		for(Food c: foodList){
			if(c.getFoodName()==foodName){
			food=c;
			}
		}
		return food;
	}

	
}

