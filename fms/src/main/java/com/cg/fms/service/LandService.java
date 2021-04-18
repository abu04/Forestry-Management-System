package com.cg.fms.service;
import java.util.List;

import com.cg.fms.dto.Land;

public interface LandService {
  public Land getLand(String surveyno);
	public List<Land> getAllLands();
	public boolean addLand(Land Land);
	public boolean updateLand(Land land );
	public boolean deleteLand(String surveyno);

}
