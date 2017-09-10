package com.mariadb.foodorderingsystem.services;

import java.util.List;

import com.mariadb.foodorderingsystem.model.Food;

public interface FoodService {
	
public Food addFood(Food food);
public List<Food> getFoodList();
public Food findFoodByName(String foodName);
}