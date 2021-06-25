package com.svfcso.service;

import java.util.List;

import com.svfcso.model.FeedbackVO;

public interface FeedbackService {

	void addFeedback(FeedbackVO feedbackVO);

	List displayFeedbackToAdmin();

	List displayFeedbackToBM(FeedbackVO feedbackVO);

}
