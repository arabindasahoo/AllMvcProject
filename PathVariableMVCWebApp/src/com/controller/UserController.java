package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/users")
public class UserController {
	@RequestMapping(value="/user/{userName}/{age}",method=RequestMethod.GET)
	public ModelAndView userMessage(@PathVariable("userName") String userName ,@PathVariable("age") int age)
	{
 		return new ModelAndView("helloPage","message", "you are "+userName+"your age is "+age);
	}
}
