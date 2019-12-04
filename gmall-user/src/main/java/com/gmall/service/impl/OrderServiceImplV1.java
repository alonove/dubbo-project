package com.gmall.service.impl;

import java.util.List;

import org.assertj.core.util.Lists;

import com.alibaba.dubbo.config.annotation.Service;
import com.gmall.api.OrderService;
import com.gmall.bean.OrderInfo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

//此注解是 com.alibaba.dubbo.config.annotation.Service 下的注解，并非springboot下的@Service注解，若当前实现类需要交由springboot管理，建议使用@Component注解
@Service(version = "1.0.0")
public class OrderServiceImplV1 implements OrderService {

	@HystrixCommand
	@Override
	public List<OrderInfo> findList() {

		System.err.println("I'M 1.0.0 ==============");

		OrderInfo o1 = new OrderInfo(1L, "Tom", "笔记本", 12.5D, "1.0.0");
		OrderInfo o2 = new OrderInfo(2L, "Jack", "铅笔", 3.5D, "1.0.0");
		OrderInfo o3 = new OrderInfo(3L, "Lily", "橡皮", 5.0D, "1.0.0");

		return Lists.newArrayList(o1, o2, o3);
	}

}
