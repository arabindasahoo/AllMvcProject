package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.User;

@Controller
public class UserController {

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String getForm()
	{
		return "registerForm";
	}
	
	@RequestMapping(value="/registerSuccess",method=RequestMethod.POST)
	public ModelAndView getRegister(@RequestParam("name") String name,@RequestParam("email") String email,@RequestParam("age") int age,@RequestParam("country") String country)
	{
		
		User user=new User(name, email, age, country);
		
		ModelAndView mav=new ModelAndView("success");
		mav.addObject("user", user);
		
		return mav;
		
	}
}
