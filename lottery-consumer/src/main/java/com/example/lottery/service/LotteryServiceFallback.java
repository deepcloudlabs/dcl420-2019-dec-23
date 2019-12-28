package com.example.lottery.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class LotteryServiceFallback implements LotteryService {

	@Override
	public List<Integer> draw() {
		return Arrays.asList(4, 8, 15, 16, 23, 42);
	}

}
