/**
 * 
 */
package com.mum.group2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mum.group2.domain.Question;
import com.mum.group2.serviceAPI.QuestionService;

/**
 * @author Govinda
 *
 */
@Controller
@RequestMapping(value = "OTCS")
public class QuestionController {
	
	@Autowired
	public QuestionService questionService;
	
	/*@RequestMapping(value="", method = RequestMethod.GET)
    public String getQuestion( ) {
    	
		questionService.findOne( );
    	
        return "questionDetails";
    }*/
	
	@RequestMapping(value="/question", method = RequestMethod.GET)
    public String save( ) {
    	
		/*questionService.save(question);*/
    	
        return "users";
    }

}
