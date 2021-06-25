package com.svfcso.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.svfcso.dao.CityDAO;
import com.svfcso.model.CityVO;
import com.svfcso.service.CityService;

@Service
@Transactional
public class CityServiceImpl implements CityService{
	@Autowired 
	private CityDAO cityDAO;

	public void cityInsert(CityVO cityVO) {
		this.cityDAO.insert(cityVO);
	}

	public List cityDisplay() {
		List ls = this.cityDAO.view();  
		return ls;
	}

	public List citySearchById(CityVO cityVO) {
		List ls = this.cityDAO.searchById(cityVO);  
		return ls;
	}

	public List ajaxCitySearch(CityVO cityVO) {
		List CityList = this.cityDAO.ajaxCitySearch(cityVO);
		return CityList;
	}	
}
