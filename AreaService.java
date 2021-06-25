package com.svfcso.service;

import java.util.List;

import com.svfcso.model.AreaVO;

public interface AreaService {
	public void areaInsert(AreaVO areaVO);
	public List areaDisplay();
	public List areaSearchById(AreaVO areaVO);
	public List ajaxAreaSearch(AreaVO areaVO);
}
