package com.enthudrives.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class ConfigController {
	@Value("${address.city}")
	private String city;

	@GetMapping(value="/city")
	@ResponseBody
	public String getMyCity() {
		return city;
	}
}
