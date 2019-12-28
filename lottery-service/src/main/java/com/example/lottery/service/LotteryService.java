package com.example.lottery.service;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@RefreshScope
public class LotteryService {
	@Value("${lottery.min}") private int lotteryMin;
	@Value("${lottery.max}") private int lotteryMax;
	@Value("${lottery.size}") private int lotterySize;
	
	public List<Integer> draw() {
		return ThreadLocalRandom.current().ints(lotteryMin,lotteryMax)
				 .distinct()
				 .limit(lotterySize)
				 .sorted()
				 .boxed().collect(Collectors.toList());
	}

}
