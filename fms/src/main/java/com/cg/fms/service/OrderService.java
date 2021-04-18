package com.cg.fms.service;

import java.util.List;

import com.cg.fms.dto.Orders;

public interface OrderService {
	
	public Orders getOrder(int orderNumber);
	public boolean addOrder(Orders odd);
	public boolean deleteOrder(int oddnum);
	public boolean updateOrders(Orders odd);
	public List<Orders> getAllOrders();
}
