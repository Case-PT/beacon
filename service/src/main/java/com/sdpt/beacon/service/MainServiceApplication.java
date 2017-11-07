package com.sdpt.beacon.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MainServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(MainServiceApplication.class, args);
	}

	@RequestMapping("/")
	public String home() {
		return "Go to <a href = \"/hello\">hello form</a>";
	}
}
