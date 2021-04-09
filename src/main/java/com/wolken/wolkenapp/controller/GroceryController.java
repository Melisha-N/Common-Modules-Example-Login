package com.wolken.wolkenapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.wolkenapp.dto.GroceryDTO;
import com.wolken.wolkenapp.service.GroceryService;

@Controller
@RequestMapping("/")
public class GroceryController {
	
	@Autowired
	GroceryService groceryService;
	
	Logger logger = Logger.getLogger(GroceryController.class);
	
	@RequestMapping("/addgrocery.mel")
	public String saveGrocery(@ModelAttribute GroceryDTO groceryDTO , HttpServletRequest req ) {
		logger.info("Inside saveGrocery() of GroceryController\n");
		String saveGroceryMsg = groceryService.validateAndSave(groceryDTO);
		
		logger.info("Setting attribute--saveGroceryMsg");
		req.setAttribute("saveGroceryMsg", saveGroceryMsg);
		
		logger.info("End of saveGrocery() of GroceryController\n");
		return "groceryDisplay.jsp";
		
	}

}
