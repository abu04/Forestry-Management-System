package com.cg.fms.service;

import com.cg.fms.dao.ILoginDaoImpl;

public class ILoginServiceImpl implements ILoginService {
	ILoginDaoImpl udao=new ILoginDaoImpl();
	@Override
	public int validate(String userName, String password, String role) {
		return udao.validate(userName, password, role);
	}

}
