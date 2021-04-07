package com.wolken.wolkenapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.wolkenapp.dto.LoginDTO;
import com.wolken.wolkenapp.service.LoginService;
import com.wolken.wolkenapp.service.PageService;

@Controller
@RequestMapping("/")
public class LoginController {
	Logger logger = Logger.getLogger(PageController.class);
	@Autowired
	LoginService loginService;	
	
	@RequestMapping("/login.mel")
	public String login(@ModelAttribute LoginDTO loginDTO, HttpServletRequest req) {
		
		logger.info("Inside login method of  Login Controller ");
		String loginMsg = loginService.validateAndLogin(loginDTO);
		logger.info("Setting loginMsg");
		req.setAttribute("loginMsg", loginMsg);
		logger.info("End of login method of  Login Controller ");
		return "final.jsp";
	
	}
}
