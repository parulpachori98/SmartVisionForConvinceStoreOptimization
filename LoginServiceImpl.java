package com.svfcso.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.svfcso.dao.LoginDAO;
import com.svfcso.model.LoginVO;
import com.svfcso.model.RegisterVO;
import com.svfcso.service.LoginService;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {

	@Autowired 
	LoginDAO loginDAO;
	
	public void register(RegisterVO registerVO){
		this.loginDAO.register(registerVO);
	}

	public void insertLogin(LoginVO loginVO){
		this.loginDAO.insertLogin(loginVO);
	}

	public List searchByEmail(String loginService){
		List searchList =  this.loginDAO.searchLoginID(loginService);
		return searchList;
	}

	public List searchById(LoginVO loginVO) {
		List searchList = this.loginDAO.searchById(loginVO);
		return searchList;
	}

	@Override
	public List searchByUsername(LoginVO loginVO) {
		List searchList = this.loginDAO.searchByUsername(loginVO);
		return searchList;
	}
	
	public void delete(LoginVO loginVO) {
		this.loginDAO.delete(loginVO);
	}

}
