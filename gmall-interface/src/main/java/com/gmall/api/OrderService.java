package com.gmall.api;

import java.util.List;

import com.gmall.bean.OrderInfo;

public interface OrderService {

	List<OrderInfo> findList();

}
