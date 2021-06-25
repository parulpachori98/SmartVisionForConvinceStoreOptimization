package com.svfcso.service;

import java.util.List;

import com.svfcso.model.StateVO;

public interface StateService {
	public void stateInsert(StateVO stateVO);
	
	public List stateDisplay();
	
	public List stateSearchById(StateVO stateVO);
}
