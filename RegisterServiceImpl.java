package com.svfcso.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.svfcso.dao.RegisterDAO;
import com.svfcso.model.RegisterVO;
import com.svfcso.service.RegisterService;

@Service 
@Transactional
public class RegisterServiceImpl implements RegisterService {

	@Autowired 
	RegisterDAO regDAO;
	
	public void insertRegister(RegisterVO registerVO)
	{
		this.regDAO.insertRegister(registerVO);
	}

	public List searchByLoginId(RegisterVO registerVO) {
		List searchList = new ArrayList();
		searchList = this.regDAO.searchByLoginId(registerVO);
		return searchList;
	}

	public void delete(RegisterVO registerVO) {
		this.regDAO.delete(registerVO);
	}
}
