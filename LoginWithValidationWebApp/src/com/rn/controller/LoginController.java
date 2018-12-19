package com.rn.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rn.model.Student;
import com.rn.model.StudentLogIn;
import com.rn.service.CheckLogIn;
@Controller
public class LoginController {
	@Autowired
	private CheckLogIn checkLogIn;
	
	public void setCheckLogIn(CheckLogIn checkLogIn) {
		this.checkLogIn = checkLogIn;
	}
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String getHomePage(Model model) {
		
		return "index";
	}
	@RequestMapping(value="/signup",method=RequestMethod.GET)
	public String getRegisterPage(Model model)
	{
		model.addAttribute(new Student());
		return "registerForm";	
	}
	@RequestMapping(value="/signin",method=RequestMethod.GET)
	public String getLogInPage(Model model) {
		model.addAttribute(new StudentLogIn());
		return "login";
	}
	@RequestMapping(value="/registerStudent",method=RequestMethod.POST)
	public ModelAndView registerStudent(@Valid @ModelAttribute("student")Student student,BindingResult result) {
		
		if(result.hasErrors())
		{
			return new ModelAndView("registerForm");
		}
		boolean flag=checkLogIn.addStudent(student);
		if(flag) {
		 return new ModelAndView("success");
		}
		return new ModelAndView("failure");
	}
	@RequestMapping(value="/loginStudent",method=RequestMethod.POST)
	public ModelAndView logInStudent(@Valid @ModelAttribute("studentLogIn") StudentLogIn logIn,BindingResult result) {
		if(result.hasErrors()) {
			return new ModelAndView("login");
		}
		Student student=checkLogIn.getStudent(logIn.getEmail(),logIn.getPassword());
		if(student!=null) {
			return new ModelAndView("studentDetails","studentdetails",student);
		}
		else 
		{
			return new ModelAndView("failure");
		}
		
	}
	
	@ModelAttribute
	public void loginmessage(Model model)
	{
		model.addAttribute("loginmessage", "Welcome To Student Login Page");
		model.addAttribute("SignUpmessage", "Welcome To Student SignUp Page");
		model.addAttribute("header","Welcome to Student Corner");
		
	}
	
/*	@ExceptionHandler(RuntimeException.class)
	public String exceptionMessage()
	{
		return "runTimeException";
	}
*/
}
