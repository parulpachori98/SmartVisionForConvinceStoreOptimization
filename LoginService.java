package com.svfcso.service;

import java.util.List;

import com.svfcso.model.LoginVO;
import com.svfcso.model.RegisterVO;

public interface LoginService {

	public void register(RegisterVO registerVO);

	public void insertLogin(LoginVO loginVO);

	public List searchByEmail(String loginService);
	
	public List searchById(LoginVO loginVO);
	
	public List searchByUsername(LoginVO loginVO);
	
	public void delete(LoginVO loginVO);
}
