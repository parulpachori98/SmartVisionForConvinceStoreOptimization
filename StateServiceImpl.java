package com.svfcso.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.svfcso.dao.StateDAO;
import com.svfcso.model.StateVO;
import com.svfcso.service.StateService;

@Service
@Transactional
public class StateServiceImpl implements StateService{
	@Autowired
	private StateDAO stateDAO;
	
	public void stateInsert(StateVO stateVO) {
		this.stateDAO.insert(stateVO);
	}

	public List stateDisplay() {
		List ls = new ArrayList();
		ls = this.stateDAO.display();
		return ls;
	}

	public List stateSearchById(StateVO stateVO) {
		List ls = new ArrayList();
		ls = this.stateDAO.searchById(stateVO);
		return ls;
	}
	
}
