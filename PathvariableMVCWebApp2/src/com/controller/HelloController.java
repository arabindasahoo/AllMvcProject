package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping(value="/users")
public class HelloController {
	@RequestMapping(value="/users/{userName}/{age}",method=RequestMethod.GET)
	public ModelAndView greet(@PathVariable("userName") String userName,@PathVariable("age") int age)
	{
		
		return new ModelAndView("helloPage", "message", "Hello,"+userName+"you are "+age+"years old.");
	}

}
