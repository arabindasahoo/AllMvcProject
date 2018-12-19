package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.User;
import com.service.UserServiceDao;

@Controller
public class UserController {

	@Autowired
	private UserServiceDao userServiceDao;
	@RequestMapping(value="/")
	public String getRegister(Model model)
	{
		model.addAttribute("user", new User());
		return "registerForm";
	}
	@RequestMapping(value="/registerSuccess",method=RequestMethod.POST)
	public String getRegisterPage(@ModelAttribute("user") User user)
	{
		userServiceDao.addUser(user);
		return "redirect:/listUser";
	}
	
	@RequestMapping(value="listUser",method=RequestMethod.GET)
	public ModelAndView getUserList(ModelAndView modelAndView)
	{
		modelAndView.setViewName("userView");
		List<User> listUser=userServiceDao.fetchAllUser();
		modelAndView.addObject("listUser", listUser);
		return modelAndView;
	}
	
}
