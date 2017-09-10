package com.mariadb.foodorderingsystem.model;

public class FoodOrder {
	private int id;
	private int quantity;
	private Customer customer;
	private Waiter waiter;
	private Food food;
	public FoodOrder(){}
	public FoodOrder(int id, int quantity, int totalAmount, Customer customer, Waiter waiter, Food food) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.customer = customer;
		this.waiter = waiter;
		this.food = food;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Waiter getWaiter() {
		return waiter;
	}
	public void setWaiter(Waiter waiter) {
		this.waiter = waiter;
	}
	public Food getFood() {
		return food;
	}
	public void setFood(Food food) {
		this.food = food;
	}
	
	
	
}
