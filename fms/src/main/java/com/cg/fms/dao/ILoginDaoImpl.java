package com.cg.fms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.fms.dto.User;

public class ILoginDaoImpl implements ILoginDao {
	EntityManager emanager;
	public ILoginDaoImpl() {
		emanager=JpaUtils.getEntityManager();
	}
	@Override
	public int validate(String username, String password, String role) {
		int val=0;
		TypedQuery<User> q=emanager.createQuery("select u from User u",User.class );
		List<User> userlist=q.getResultList();
		for(User u:userlist) {
			if(u.getUserName().equals(username)&&u.getPassword().equals(password)&&u.getRole().equals(role)) {
				if(role.equals("admin"))
					val= 1;
				else if(role.equals("customer"))
					val= 2;
			}
		}		

		return val;
	}

}
