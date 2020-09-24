package com.tetherfi.controller;

import java.net.Inet4Address;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@GetMapping(value = "/CheckStatus")
	public String getStatus() {
		String ipAddress = null;
		try {
			ipAddress = Inet4Address.getLocalHost() + "";

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "SpringBoot Demo is running on " + ipAddress;
	}
}
