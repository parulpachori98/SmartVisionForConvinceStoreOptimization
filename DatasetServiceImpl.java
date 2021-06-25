package com.svfcso.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.svfcso.dao.DatasetDAO;
import com.svfcso.model.DatasetVO;
import com.svfcso.service.DatasetService;

@Service
@Transactional
public class DatasetServiceImpl implements DatasetService{
	@Autowired
	private DatasetDAO datasetDAO;
	
	public void datasetInsert(DatasetVO datasetVO) {
		this.datasetDAO.insert(datasetVO);
	}
	
	public List datasetDisplay() {
		List DatasetList = new ArrayList();
		DatasetList = this.datasetDAO.display();
		return DatasetList;
	}

	public List datasetSearchById(DatasetVO datasetVO) {
		List DatasetList = new ArrayList();
		DatasetList = this.datasetDAO.searchById(datasetVO);
		return DatasetList;
	}

	public void datasetDelete(DatasetVO datasetVO) {
		this.datasetDAO.delete(datasetVO);
	}
	
}