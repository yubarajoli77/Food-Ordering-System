package com.mariadb.foodorderingsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mariadb.foodorderingsystem.model.FoodOrder;
import com.mariadb.foodorderingsystem.model.Waiter;
import com.mariadb.foodorderingsystem.services.FoodOrderService;

import java.util.List;

@RestController
@RequestMapping(value="/foodOrder",method= RequestMethod.GET)
public class FoodOrderController {
	@Autowired
	FoodOrderService foodOrderService;
	
	@RequestMapping(value="/foodOrders",method= RequestMethod.GET)
	public ResponseEntity<List<FoodOrder>> getAllOrder(){
		List<FoodOrder> allOrder=foodOrderService.getAllOrder();
		if(allOrder==null||allOrder.isEmpty()){
			return new ResponseEntity<List<FoodOrder>>(allOrder,HttpStatus.NO_CONTENT);
			
		}
		return new ResponseEntity<List<FoodOrder>>(allOrder,HttpStatus.OK);
	}
	@RequestMapping(value="/order",method= RequestMethod.GET)
	public ResponseEntity<FoodOrder> giveOrder(@RequestBody FoodOrder foodOrder){
		foodOrderService.getOrder(foodOrder);
		return new ResponseEntity<>(foodOrder,HttpStatus.CREATED);
	}	
	public ResponseEntity<Integer> getBill(@RequestParam int id){
		Integer totalBill= foodOrderService.total(id);
		return new ResponseEntity<>(totalBill,HttpStatus.OK);
	}
	
}
