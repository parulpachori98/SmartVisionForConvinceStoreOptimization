package com.svfcso.service;

import java.util.List;

import com.svfcso.model.CityVO;

public interface CityService {
	public void cityInsert(CityVO cityVO);
	public List cityDisplay();
	public List citySearchById(CityVO cityVO);
	public List ajaxCitySearch(CityVO cityVO);
}
