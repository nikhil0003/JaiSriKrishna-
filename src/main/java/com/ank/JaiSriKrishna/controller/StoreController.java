package com.ank.JaiSriKrishna.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StoreController {

	@GetMapping(value="/")
	public String getMainPage() {
		return "index";
	}
	
	@GetMapping(value="/myAccount")
	public String getMyAccount() {
		return "myaccount";
	}
}
