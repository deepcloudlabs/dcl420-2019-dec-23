package com.example.lottery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

//@Service
public class LotteryConsumerService4 {
	@Autowired
	private RestTemplate restTemplate;
	private String logicalServiceName = "//lottery";
	private String url = logicalServiceName + "/lottery/api/v1/numbers";

	@Scheduled(fixedRate = 3000)
	public void callLotteryService() {
		System.out.println(restTemplate.getForObject(url, String.class));
	}
}
