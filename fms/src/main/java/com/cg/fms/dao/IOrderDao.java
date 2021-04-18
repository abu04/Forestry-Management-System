package com.cg.fms.dao;

import java.util.List;

import com.cg.fms.dto.Orders;

public interface IOrderDao {
	public Orders getOrder(int orderNumber);
	public void addOrder(Orders odd);
	public boolean deleteOrder(int oddnum);
	public boolean updateOrders(Orders odd);
	public List<Orders> getAllOrders();
	public void beginTransaction();
	public void commitTransaction();
}
