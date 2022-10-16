package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get")
public class Client2Controller {
	@Autowired
	Environment env;

	
	@GetMapping("/show")
 public String show()
 {
	 return "Inside-->Client2Controller"+env.getProperty("local.server.port");
 }
	@GetMapping("/sendMsg")
	public String messageFromClient1()
	{
		return "messageFromClient2";
	}
}
