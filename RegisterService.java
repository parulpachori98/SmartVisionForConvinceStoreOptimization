package com.svfcso.service;

import java.util.List;

import com.svfcso.model.RegisterVO;

public interface RegisterService {

	public void insertRegister(RegisterVO registerVO);
	
	public List searchByLoginId(RegisterVO registerVO);
	
	public void delete(RegisterVO registerVO);
}
