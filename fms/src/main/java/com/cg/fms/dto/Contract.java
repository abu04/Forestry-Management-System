package com.cg.fms.dto;

public class Contract {
  private int contractno;
	//private String deliveryplace;
	private String expirydate;
	private String quantity;
	private Land land;
  
	public Contract(int contractno, String expirydate, String quantity, Land land) {
		this.contractno = contractno;
		this.expirydate = expirydate;
		this.quantity = quantity;
		this.land = land;
	}
	public int getContractno() {
		return contractno;
	}
	public void setContractno(int contractno) {
		this.contractno = contractno;
	}
	public String getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public Land getLand() {
		return land;
	}
	public void setLand(Land land) {
		this.land = land;
	}

}
