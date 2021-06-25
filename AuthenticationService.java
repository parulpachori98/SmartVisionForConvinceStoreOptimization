package com.svfcso.service;

import java.util.List;

import com.svfcso.model.AuthenticationVO;

public interface AuthenticationService {
	public void insertAuth (AuthenticationVO authenticationVO);
	
	public List searchById (AuthenticationVO authenticationVO);
	
	public void delete (AuthenticationVO authenticationVO);
}
