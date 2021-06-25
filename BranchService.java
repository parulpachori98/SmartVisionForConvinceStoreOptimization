package com.svfcso.service;


import java.util.List;

import com.svfcso.model.BranchVO;

public interface BranchService {
	public void branchInsert(BranchVO branchVO);
	
	public List branchDisplay();
	
	public List branchSearchById(BranchVO branchVO);
	
	public List branchSearchNotEnabled();
}
