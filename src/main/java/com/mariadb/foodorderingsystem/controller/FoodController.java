package com.mariadb.foodorderingsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mariadb.foodorderingsystem.model.Food;
import com.mariadb.foodorderingsystem.services.FoodService;
import com.mariadb.foodorderingsystem.services.FoodServiceImp;

@RestController
@RequestMapping(value="/food")
public class FoodController {
@Autowired
FoodService foodService;

@RequestMapping(value="/addFood",method=RequestMethod.POST)
	public Food addFood(@RequestBody Food food){
		foodService.addFood(food);
		return food;
	}
@RequestMapping(value="/allFood",method=RequestMethod.GET)
	public ResponseEntity<List<Food>> getAllFood(){
		List<Food> resultFood=foodService.getFoodList();
		if(resultFood==null){
			return new ResponseEntity<List<Food>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Food>>(resultFood,HttpStatus.OK);
	}
@RequestMapping(value="/findFood",method=RequestMethod.GET)
	public Food findFood(@RequestParam String foodName){
		Food searchFood=foodService.findFoodByName(foodName);
		return searchFood;
	}
}
