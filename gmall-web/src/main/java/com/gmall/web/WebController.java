package com.gmall.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gmall.api.OrderService;
import com.gmall.bean.OrderInfo;

@RestController
public class WebController {

	@Autowired
	private OrderService orderService;

	@GetMapping("/list")
	public List<OrderInfo> list() {
		return orderService.findList();
	}

}
