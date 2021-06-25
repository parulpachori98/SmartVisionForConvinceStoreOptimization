package com.svfcso.service;

import java.util.List;

import com.svfcso.model.ComplainVO;

public interface ComplainService {
	
	public void addComplain(ComplainVO complainVO);
	
	public List searchComplainById(ComplainVO complainVO);
	
	public List displayComplainToAdmin();
	
	public List displayComplainToBM(ComplainVO complainVO);
}
