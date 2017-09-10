package com.mariadb.foodorderingsystem.model;

public class Food {
	private String foodName;
	private int foodId;
	private int foodPrice;
	
	public Food(){}

	public Food(String foodName, int foodId, int foodPrice) {
		super();
		this.foodName = foodName;
		this.foodId = foodId;
		this.foodPrice = foodPrice;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getFoodId() {
		return foodId;
	}

	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}

	public int getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	};
	
	

}
