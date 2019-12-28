package com.example.lottery.service;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

//@Service
public class LotteryConsumerService {
	@Autowired DiscoveryClient discoveryClient;
	private List<ServiceInstance> instances;
	private AtomicInteger counter = new AtomicInteger();
	
	@PostConstruct
	public void init() {
		instances = discoveryClient.getInstances("lottery");
	}
	
	@Scheduled(fixedRate = 3000)
	public void callLotteryService() {
		RestTemplate restTemplate = new RestTemplate();
		int index = counter.getAndIncrement()%instances.size();
		ServiceInstance server = instances.get(index );
		String url = String.format("http://%s:%d/lottery/api/v1/numbers",server .getHost(),server.getPort());
		String response = restTemplate.getForObject(url,String.class);
		System.out.println(response + " from " + url);
	}
}
