package com.svfcso.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.svfcso.dao.AuthenticationDAO;
import com.svfcso.model.AuthenticationVO;
import com.svfcso.service.AuthenticationService;

@Service
@Transactional
public class AuthenticationServiceImpl implements AuthenticationService{
	@Autowired
	private AuthenticationDAO authenticationDAO;
	
	public void insertAuth(AuthenticationVO authenticationVO) {
		this.authenticationDAO.insert(authenticationVO);
	}

	public List searchById(AuthenticationVO authenticationVO) {
		List AuthList = this.authenticationDAO.searchById(authenticationVO);
		return AuthList;
	}

	public void delete(AuthenticationVO authenticationVO) {
		this.authenticationDAO.delete(authenticationVO);
	}

}
