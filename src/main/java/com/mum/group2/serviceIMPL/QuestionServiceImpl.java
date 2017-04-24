package com.mum.group2.serviceIMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mum.group2.domain.Question;
import com.mum.group2.repository.QuestionRepository;
import com.mum.group2.serviceAPI.QuestionService;

@Service
@Transactional
public class QuestionServiceImpl implements QuestionService{
	
	@Autowired
	QuestionRepository questionRepository;
	

	public Question save(Question question) {
		// TODO Auto-generated method stub
		return questionRepository.save(question);
	}

}
