package com.example.lottery.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.BaseLoadBalancer;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.LoadBalancerBuilder;
import com.netflix.loadbalancer.RoundRobinRule;
import com.netflix.loadbalancer.Server;

//@Service
public class LotteryConsumerService2 {
	@Autowired DiscoveryClient discoveryClient;
	private List<Server> servers;
	private BaseLoadBalancer loadBalancer;
	
	@PostConstruct
	public void init() {
		List<ServiceInstance> instances = discoveryClient.getInstances("lottery");
		servers = instances.stream().map(srv -> new Server(srv.getHost(), srv.getPort()))
				              .collect(Collectors.toList());
		IRule roundRobinRule = new RoundRobinRule();
		this.loadBalancer = LoadBalancerBuilder.newBuilder()
				            .withRule(roundRobinRule)
				            .buildFixedServerListLoadBalancer(servers);
	}
	
	@Scheduled(fixedRate = 3000)
	public void callLotteryService() {
		RestTemplate restTemplate = new RestTemplate();
		Server server = loadBalancer.chooseServer();
		String url = String.format("http://%s:%d/lottery/api/v1/numbers",server .getHost(),server.getPort());
		String response = restTemplate.getForObject(url,String.class);
		System.out.println(response + " from " + url);
	}
}
