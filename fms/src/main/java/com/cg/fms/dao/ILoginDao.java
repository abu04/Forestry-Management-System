package com.cg.fms.dao;

public interface ILoginDao {
	public int validate(String username,String password,String role);
}
