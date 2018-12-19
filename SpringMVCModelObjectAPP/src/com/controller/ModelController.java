package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelController {
	
	@RequestMapping(value="/")
	public String getMessage()
	{
		return "homePage";
	}
	
	@ModelAttribute
	public void getModelObjectData(Model model)
	{

		model.addAttribute("headerMessage", "Welcome To Home Page");
		model.addAttribute("userMessage", "Hello Every one!!!");
		
	}

	/*@RequestMapping(value="/")
	public String getMessage(Map<String ,Object> map)
	{
		map.put("headerMessage", "Welcome To Home Page");
		map.put("userMessage", "Hello Every one!!!");
		return "homePage";
		
	}*/
	
	
	/*@RequestMapping(value="/")
	public String getMessage(Model model)
	{
		model.addAttribute("headerMessage", "Welcome To Home Page");
		model.addAttribute("userMessage", "Hello Every one!!!");
		return "homePage";
	}*/

}
