package com.wolken.wolkenapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.DispatcherServlet;

import com.wolken.wolkenapp.dto.PageDTO;
import com.wolken.wolkenapp.service.PageService;
//@Component
@Controller
@RequestMapping("/")
public class PageController {
	
	Logger logger = Logger.getLogger(PageController.class);
	@Autowired
	PageService pageService;	
	
	@RequestMapping("/add.mel")
	public String save(@ModelAttribute PageDTO pageDTO, HttpServletRequest req) {
		
		logger.info("Inside save method of  Page Controller");
		String saveMsg = pageService.validateAndSave(pageDTO);
		req.setAttribute("savemsg", saveMsg);
		logger.info("End of save method of  Page Controller");
		return "final.jsp";
	}
}
