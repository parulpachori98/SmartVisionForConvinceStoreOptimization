package com.svfcso.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.svfcso.dao.ComplainDAO;
import com.svfcso.model.ComplainVO;
import com.svfcso.service.ComplainService;

@Service
@Transactional
public class ComplainServiceImpl implements ComplainService{
	@Autowired
	private ComplainDAO complainDAO;
	
	public void addComplain(ComplainVO complainVO) {
		this.complainDAO.insert(complainVO);
	}

	public List displayComplainToAdmin() {
		List ComplainList = new ArrayList();
		ComplainList = this.complainDAO.displayComplainToAdmin();
		return ComplainList;
	}

	public List searchComplainById(ComplainVO complainVO) {
		List SearchList = new ArrayList();
		SearchList = this.complainDAO.searchById(complainVO);
		return SearchList;
	}

	public List displayComplainToBM(ComplainVO complainVO) {
		List ComplainList = new ArrayList();
		ComplainList = this.complainDAO.displayComplainToBM(complainVO);
		return ComplainList;
	}

}
