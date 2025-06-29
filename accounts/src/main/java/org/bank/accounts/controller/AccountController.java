package org.bank.accounts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	@GetMapping("Hello")
	public String sayHello() {
		return "Hello from AccountController";
	}

}
