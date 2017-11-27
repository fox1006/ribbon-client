package com.kuaifu.ribbonclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping(path="callHelloService", method=RequestMethod.GET)
	public String callHelloService() {
		return restTemplate.getForEntity("http://client-service1/helloService", String.class).getBody();
	}
}
