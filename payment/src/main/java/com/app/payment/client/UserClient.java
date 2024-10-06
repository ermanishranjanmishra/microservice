package com.app.payment.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "user-client", url = "http://localhost:8080/admin-app")
public interface UserClient {

	
	 @GetMapping("/user")
	 public String getUser();
}
