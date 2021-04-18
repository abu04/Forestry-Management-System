package com.cg.fms.service;
import java.util.List;

import com.cg.fms.dto.Contract;

public interface ContractService {
  public Contract getContract(int contractno);
	public List<Contract> getAllContracts();
	public boolean addContract(Contract contract);
	public boolean updateContract(Contract contract);
	public boolean deteteContract(int contractno);

}
