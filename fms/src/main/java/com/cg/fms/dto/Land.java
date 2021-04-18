package com.cg.fms.dto;

public class Land {
  private int landid;
	private String surveyno;
	private String ownername;
	private String landArea;
	
	
	public Land(int landid, String surveyno, String ownername, String landArea) {
		this.landid = landid;
		this.surveyno = surveyno;
		this.ownername = ownername;
		this.landArea = landArea;
	}
	public int getLandid() {
		return landid;
	}
	public void setLandid(int landid) {
		this.landid = landid;
	}
	public String getSurveyno() {
		return surveyno;
	}
	public void setSurveyno(String surveyno) {
		this.surveyno = surveyno;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public String getLandArea() {
		return landArea;
	}
	public void setLandArea(String landArea) {
		this.landArea = landArea;
	}
	
}
