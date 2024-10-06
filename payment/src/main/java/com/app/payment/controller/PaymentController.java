package com.app.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.payment.client.UserClient;

@RestController
@RequestMapping("payment")
public class PaymentController {
	
	@Autowired
	private UserClient userClient;
	
	@GetMapping
	public String getPayment() {
		return "Hii, This is payment portal";
	}
	
	@GetMapping("/test")
	public String getTesting() {
		return userClient.getUser();
	}

}
