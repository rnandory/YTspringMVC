package com.newlecture.web.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class IndexController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("index controller");
		ModelAndView mv = new ModelAndView();
		mv.addObject("data", "Hello Spring MVC~");
		mv.setViewName("index");
		
		return mv;
	}

}
