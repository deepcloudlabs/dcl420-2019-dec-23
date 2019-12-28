package com.example.lottery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class LotteryConsumerService3 {
	@Autowired
	private LotteryService lotteryService;

	@Scheduled(fixedRate = 3000)
	public void callLotteryService() {
		System.out.println(lotteryService.draw());
	}
}
