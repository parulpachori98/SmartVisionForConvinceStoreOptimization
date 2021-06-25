package com.svfcso.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.svfcso.dao.BranchDAO;
import com.svfcso.model.BranchVO;
import com.svfcso.service.BranchService;

@Service
@Transactional
public class BranchServiceImpl implements BranchService{
	@Autowired
	private BranchDAO branchDAO;
	
	public void branchInsert(BranchVO branchVO) {
		this.branchDAO.insert(branchVO);		
	}

	public List branchDisplay() {
		List BranchList = new ArrayList();
		BranchList = this.branchDAO.display();
		return BranchList;
	}

	public List branchSearchById(BranchVO branchVO) {
		List BranchList = new ArrayList();
		BranchList = this.branchDAO.searchById(branchVO);
		return BranchList;
	}

	public List branchSearchNotEnabled() {
		List BranchList = new ArrayList();
		BranchList = this.branchDAO.searchNotEnabled();
		return BranchList;
	}

}
