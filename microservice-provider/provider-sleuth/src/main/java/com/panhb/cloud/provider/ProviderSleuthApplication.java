package com.panhb.cloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author hongbo.pan
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderSleuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderSleuthApplication.class, args);
	}

}
