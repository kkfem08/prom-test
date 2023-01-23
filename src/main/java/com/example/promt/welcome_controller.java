package com.example.promt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcome_controller {
	@GetMapping("/welcome")
public String welcome() {
		return "this is test api";
}}
