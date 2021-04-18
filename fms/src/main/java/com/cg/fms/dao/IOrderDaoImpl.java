package com.cg.fms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.fms.dto.Orders;

public class IOrderDaoImpl implements IOrderDao {
	EntityManager eManager;
	public IOrderDaoImpl(){
		eManager=JpaUtils.getEntityManager();
	}
	@Override
	public Orders getOrder(int orderNumber) {
		
		return eManager.find(Orders.class, orderNumber);
	}

	@Override
	public void addOrder(Orders odd) {
		eManager.persist(odd);
		
	}

	@Override
	public boolean deleteOrder(int oddnum) {
		Orders odd=eManager.find(Orders.class,oddnum);
		eManager.remove(odd);
		return true;
	}

	@Override
	public boolean updateOrders(Orders odd) {
		eManager.merge(odd);
		return false;
	}

	@Override
	public List<Orders> getAllOrders() {
		TypedQuery<Orders> q=eManager.createQuery("select o from Orders o",Orders.class);
		List<Orders> orderList=q.getResultList();
		return orderList;
	}
	@Override
	public void beginTransaction() {
		eManager.getTransaction().begin();
	}
	@Override
	public void commitTransaction() {
		eManager.getTransaction().commit();
	}

}
