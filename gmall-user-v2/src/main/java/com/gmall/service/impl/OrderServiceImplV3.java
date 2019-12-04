package com.gmall.service.impl;

import java.util.List;

import org.assertj.core.util.Lists;

import com.alibaba.dubbo.config.annotation.Service;
import com.gmall.api.OrderService;
import com.gmall.bean.OrderInfo;

//@Service(version="3.0.0")
@Service
public class OrderServiceImplV3 implements OrderService {

	@Override
	public List<OrderInfo> findList() {

		System.err.println("I'M 3.0.0 ==============");

		OrderInfo o1 = new OrderInfo(1L, "Tom", "笔记本", 12.5D, "3.0.0");
		OrderInfo o2 = new OrderInfo(2L, "Jack", "铅笔", 3.5D, "3.0.0");
		OrderInfo o3 = new OrderInfo(3L, "Lily", "橡皮", 5.0D, "3.0.0");

		return Lists.newArrayList(o1, o2, o3);
	}

}
