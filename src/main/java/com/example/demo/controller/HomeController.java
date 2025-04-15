package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/test")
	public Map<String, String> geTtest() {
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("Hi", "leelakrishna");
		
		return map;
	}
}
