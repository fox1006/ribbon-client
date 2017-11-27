package com.kuaifu.ribbonclient;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@EnableDiscoveryClient// eureka 客户端开启
public class RibbonConfiguration {

	@Bean
	@LoadBalanced// 开启Ribbon负载均衡
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
