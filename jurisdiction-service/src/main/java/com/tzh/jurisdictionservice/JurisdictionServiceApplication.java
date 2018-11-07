package com.tzh.jurisdictionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author tzh
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient

public class JurisdictionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(JurisdictionServiceApplication.class, args);
	}
}
