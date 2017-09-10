package com.mariadb.foodorderingsystem.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mariadb.foodorderingsystem.model.Waiter;
import com.mariadb.foodorderingsystem.services.WaiterService;

@RestController
@RequestMapping(value="/waiter")
public class WaiterController {
	@Autowired
	WaiterService waiterService;
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public ResponseEntity<Waiter> addWaiter(@RequestBody Waiter waiter ){
		waiterService.addWaiter(waiter);
		return new ResponseEntity<>(waiter, HttpStatus.OK);
	}
	
	@RequestMapping(value="/allWaiters",method=RequestMethod.GET)
	public ResponseEntity<List<Waiter>>getAllWaiter(){
		List<Waiter> checkWaiterList=waiterService.getAllWaiter();
		if(checkWaiterList==null||checkWaiterList.isEmpty()){
			return new ResponseEntity<List<Waiter>>(checkWaiterList,HttpStatus.NO_CONTENT);
			
		}
		return new ResponseEntity<List<Waiter>>(checkWaiterList,HttpStatus.OK);
	}
	@RequestMapping(value="/findById")
	public ResponseEntity<Waiter>findWaiterById(@RequestParam int id){
		Waiter waiter=waiterService.findWaiterById(id);
		if(waiter==null){
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Waiter>(waiter,HttpStatus.OK);
	}
	@RequestMapping(value="/findByFirstName",method= RequestMethod.GET)
	public ResponseEntity<List<Waiter>>findWaiterByFirstName(@RequestParam String firstName){
		List<Waiter> searchedWaiter=waiterService.findWaiterByFirstName(firstName);
		if(searchedWaiter==null || searchedWaiter.isEmpty()){
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Waiter>>(searchedWaiter, HttpStatus.OK);
	}
} 
