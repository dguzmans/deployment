package com.example.demo.deployment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/")
	public String hello() {
		return "Hola mundo Test de integracion 2!!!";
	}
}
