package com.example.assignment2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class ControllerClass {

	@RequestMapping("/bank/branches")
	public String bankBranches() {
		return "BankBranches";
	}

	@RequestMapping("/bank/services")
	public String bankServices() {
		return "BankServices";
	}
}
