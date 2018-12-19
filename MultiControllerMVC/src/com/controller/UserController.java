package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.User;

@Controller
public class UserController {

	@RequestMapping(value="/user")
	public ModelAndView getUser()
	{
		return new ModelAndView("view","user","User viewed");
	}
	
	@RequestMapping(value="/delete")
	public ModelAndView delete(User user)
	{
		return new ModelAndView("deleteUser", "user","User deleted");
	}
	
	@RequestMapping(value="/update")
	public ModelAndView updateUser(User user)
	{
		return new ModelAndView("update", "user","User updated");
	}
}
