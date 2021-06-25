package com.svfcso.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.svfcso.dao.FeedbackDAO;
import com.svfcso.model.FeedbackVO;
import com.svfcso.service.FeedbackService;
@Service
@Transactional
public class FeedbackServiceImpl implements FeedbackService{
	@Autowired
	private FeedbackDAO feedbackDAO;
	
	public void addFeedback(FeedbackVO feedbackVO) {
		this.feedbackDAO.addFeedback(feedbackVO);
	}

	public List displayFeedbackToAdmin() {
		List FeedbackList = new ArrayList();
		FeedbackList = this.feedbackDAO.displayFeedbackToAdmin();
		return FeedbackList;
	}

	public List displayFeedbackToBM(FeedbackVO feedbackVO) {
		List FeedbackList = new ArrayList();
		FeedbackList = this.feedbackDAO.displayFeedbackToBM(feedbackVO);
		return FeedbackList;
	}

}
