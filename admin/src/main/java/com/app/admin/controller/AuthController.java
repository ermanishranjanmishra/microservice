package com.app.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class AuthController {
	
	@GetMapping
	public String getAdmin() {
		return "Hiii, This admin portal..";
	}

}
