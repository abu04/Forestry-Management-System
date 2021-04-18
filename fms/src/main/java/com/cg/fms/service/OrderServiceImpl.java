package com.cg.fms.service;

import java.util.List;

import com.cg.fms.dao.IOrderDaoImpl;
import com.cg.fms.dto.Orders;

public class OrderServiceImpl implements OrderService {
	IOrderDaoImpl odao= new IOrderDaoImpl();
	@Override
	public Orders getOrder(int orderNumber) {
		
		return odao.getOrder(orderNumber);
	}

	@Override
	public boolean addOrder(Orders odd) {
		odao.beginTransaction();
		odao.addOrder(odd);
		odao.commitTransaction();
		return true;
	}

	@Override
	public boolean deleteOrder(int oddnum) {
		odao.beginTransaction();
		odao.deleteOrder(oddnum);
		odao.commitTransaction();
		return true;
	}

	@Override
	public boolean updateOrders(Orders odd) {
		odao.beginTransaction();
		odao.updateOrders(odd);
		odao.commitTransaction();
		return true;
	}

	@Override
	public List<Orders> getAllOrders() {
	
		return odao.getAllOrders();
	}

}
