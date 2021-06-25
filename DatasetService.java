package com.svfcso.service;

import java.util.List;

import com.svfcso.model.DatasetVO;

public interface DatasetService {
	public void datasetInsert(DatasetVO datasetVO);
	
	public List datasetDisplay();
	
	public List datasetSearchById(DatasetVO datasetVO);
	
	public void datasetDelete(DatasetVO datasetVO);
}