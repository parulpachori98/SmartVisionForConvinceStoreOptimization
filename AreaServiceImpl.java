package com.svfcso.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.svfcso.dao.AreaDAO;
import com.svfcso.model.AreaVO;
import com.svfcso.service.AreaService;

@Service
@Transactional
public class AreaServiceImpl implements AreaService{
	@Autowired
	private AreaDAO areaDAO;

	public void areaInsert(AreaVO areaVO) {
		this.areaDAO.insert(areaVO);
	}

	public List areaDisplay() {
		List AreaList = new ArrayList();
		AreaList = this.areaDAO.view();
		return AreaList;
	}

	public List areaSearchById(AreaVO areaVO) {
		List AreaList = new ArrayList();
		AreaList = this.areaDAO.searchById(areaVO);
		return AreaList;
	}
	
	public List ajaxAreaSearch(AreaVO areaVO) {
		List AreaList = this.areaDAO.ajaxAreaSearch(areaVO);
		return AreaList;
	}
}
