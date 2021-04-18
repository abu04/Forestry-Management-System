package com.cg.fms.dao;
import java.util.List;

import com.cg.fms.dto.Land;

public interface ILandDao {
  public Land getLand(String surveyno);
	public List<Land> getAllLands();
	public boolean addLand(Land Land);
	public boolean updateLand(Land land );
	public boolean deleteLand(String surveyno);

}
