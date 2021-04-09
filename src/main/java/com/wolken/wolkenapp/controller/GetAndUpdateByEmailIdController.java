package com.wolken.wolkenapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.wolkenapp.dto.UpdateDTO;
import com.wolken.wolkenapp.entity.PageEntity;
import com.wolken.wolkenapp.service.GetAndUpdateByEmailIdService;

@Controller
@RequestMapping("/")
public class GetAndUpdateByEmailIdController {
	
	@Autowired
	GetAndUpdateByEmailIdService getAndUpdateByEmailIdService;
	
	Logger logger =Logger.getLogger(GetAndUpdateByEmailIdController.class);
	
	
	@RequestMapping("/emailid.mel")
	public String getbyEmailId(HttpServletRequest req) {
		
		logger.info("Inside getbyEmailId method of  Get And Update By Email Id Controller\n");
		
		logger.info("Getting parameter-emailId");
		String emailId =req.getParameter("emailId");
		logger.info("emailId --get parameter"+emailId);
		
		logger.info("Calling getByEmailIdService.validateAndGetEmailId(emailId)\n");
		PageEntity pageEntity = getAndUpdateByEmailIdService.validateAndGetEmailId(emailId);
		
		logger.info("Setting parameter-emailId\n");
		req.setAttribute("pageEntity", pageEntity);
		logger.info("Page Entity values:"+pageEntity+"\n");
		
		logger.info("End of getbyEmailId method of  Update By Email Id Controller\n");
		
		return "emailDisplay.jsp";
		
	}
	
	@RequestMapping("/emailIdDisplay.mel")
	public String updatebyEmailId(@ModelAttribute UpdateDTO updateDTO,HttpServletRequest req) {
		
		logger.info("Inside updatebyEmailId method of  Get And Update By Email Id Controller\n");
		
		logger.info("Calling getAndUpdateByEmailIdService.validateAndUpdate");
		
		String updateMsg = getAndUpdateByEmailIdService.validateAndUpdate(updateDTO);
		
		logger.info("Setting Attribute -- updateMsg");
		req.setAttribute("updateMsg", updateMsg);
		
		return "final.jsp";
		
	}

}
