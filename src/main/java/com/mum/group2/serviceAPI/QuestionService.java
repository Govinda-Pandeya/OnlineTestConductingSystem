package com.mum.group2.serviceAPI;

import org.springframework.stereotype.Service;

import com.mum.group2.domain.Question;
@Service
public interface QuestionService {
	
	public Question save(Question question);

}
