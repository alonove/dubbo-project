package com.gmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

@SpringBootApplication
@EnableDubbo
@EnableHystrix
public class BootStart {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(BootStart.class, args);
	}

}
