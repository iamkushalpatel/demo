package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DispacherController {
	@RequestMapping("/hello")
	public String home() {
		return "Hello Docker World";
	}

}
