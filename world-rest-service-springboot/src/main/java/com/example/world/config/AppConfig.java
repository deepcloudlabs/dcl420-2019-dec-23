package com.example.world.config;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Value("${pool.size}")
	private int poolSize;

	@Bean
	@ConditionalOnProperty(name = "executor.type", havingValue = "fixed")
	public ExecutorService fixedExecutorService() {
		return Executors.newFixedThreadPool(poolSize);
	}

	@Bean
	@ConditionalOnProperty(name = "executor.type", havingValue = "cached")
	public ExecutorService cachedExecutorService() {
		return Executors.newCachedThreadPool();
	}

}
