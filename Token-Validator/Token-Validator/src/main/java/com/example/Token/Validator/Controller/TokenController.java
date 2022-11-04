package com.example.Token.Validator.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TokenController {

	@PostMapping("/token")
	public String token(@RequestParam(value = "owner", defaultValue = "") String owner) {
		return "this will be the token. " + owner;
	}
}
