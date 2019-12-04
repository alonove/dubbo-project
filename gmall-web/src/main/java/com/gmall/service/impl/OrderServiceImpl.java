package com.gmall.service.impl;

import java.util.List;

import org.apache.curator.shaded.com.google.common.collect.Lists;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gmall.api.OrderService;
import com.gmall.bean.OrderInfo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Component
public class OrderServiceImpl implements OrderService {

	//@Reference dubbo注解
	@Reference(stub="com.gmall.service.stub.OrderServiceStub", version="*", check=false)
	private OrderService orderService;

	@HystrixCommand(fallbackMethod="doError")
	@Override
	public List<OrderInfo> findList() {
		return orderService.findList();
	}

	/**
	 * 调用远程方法报错后的回调方法
	 * @return
	 */
	public List<OrderInfo> doError() {
		return Lists.newArrayList(new OrderInfo().setId(1L).setShopName("error"));
	}

}
