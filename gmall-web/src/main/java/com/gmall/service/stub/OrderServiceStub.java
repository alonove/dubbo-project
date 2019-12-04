package com.gmall.service.stub;

import java.util.List;

import com.gmall.api.OrderService;
import com.gmall.bean.OrderInfo;

/**
 * OrderService的本地存根实现
 * @Author Jun
 * @date 2019年12月2日 下午5:43:23
 */
public class OrderServiceStub implements OrderService {

	private OrderService orderService;

	/**
	 * 有参构造 dubbo会自动将远程OrderService注入进来
	 * @param orderService
	 */
	public OrderServiceStub(OrderService orderService) {
		super();
		this.orderService = orderService;
	}

	/**
	 * 在远程调用前可以进行判断
	 */
	@Override
	public List<OrderInfo> findList() {
		//参数校验、缓存处理等等
		System.err.println(Math.random() + "==================");
		//校验通过后调用远程服务
		return orderService.findList();
	}

}
