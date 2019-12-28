package com.example.lottery.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import com.example.lottery.service.LotteryService;

@RestController
@RequestScope
@RequestMapping("/numbers")
public class LotteryResource {
	@Autowired
	private LotteryService lotteryService;
	@Value("${server.port}") private int port;
	
	@GetMapping
	public List<Integer> getNumbers(){
		System.err.println("Serving the request at port "+port);
		return lotteryService.draw();
	}
}
