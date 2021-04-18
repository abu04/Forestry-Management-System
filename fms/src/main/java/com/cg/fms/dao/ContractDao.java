package com.cg.fms.dao;

import java.util.List;

import com.cg.fms.dto.Contract;

public interface ContractDAO {
	public Contract getContract(int contractno);
	public List<Contract> getAllContracts();
	public boolean addContract(Contract contract);
	public boolean updateContract(Contract contract);
	public boolean deleteContract(int contractno);
	public void beginTransaction();
	public void commitTransaction();

}
