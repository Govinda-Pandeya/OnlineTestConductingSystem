package com.mum.group2.controller;

 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
 
public class UsersController {
	
	/*@Autowired
	UsersService userService;*/
	
	 @RequestMapping(value = "/page", method = RequestMethod.GET)
	 public String getPage() {
	        
	        return "users";
	    }

}
