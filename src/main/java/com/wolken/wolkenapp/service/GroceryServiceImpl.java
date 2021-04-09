package com.wolken.wolkenapp.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolken.wolkenapp.custom.GroceryException;
import com.wolken.wolkenapp.dao.LoginDAO;
import com.wolken.wolkenapp.dto.GroceryDTO;
import com.wolken.wolkenapp.entity.GroceryEntity;

@Service
public class GroceryServiceImpl implements GroceryService {
	Logger logger = Logger.getLogger(GroceryServiceImpl.class);
	GroceryEntity groceryEntity = new GroceryEntity();
	
	@Autowired
	LoginDAO loginDAO;

	@Override
	public String validateAndSave(GroceryDTO groceryDTO) {
		try {
			if(groceryDTO != null) {
				if(groceryDTO.getGroceryName().length() < 3 || groceryDTO.getGroceryName().length() >18) {
					throw new GroceryException();
				}
				else {
					groceryEntity.setGroceryName(groceryDTO.getGroceryName());
					groceryEntity.setGroceryType(groceryDTO.getGroceryType());
					groceryEntity.setGroceryPrice(groceryDTO.getGroceryPrice());
					groceryEntity.setGroceryQuantity(groceryDTO.getGroceryQuantity());
					groceryEntity.setGroceryAvailability(groceryDTO.getGroceryAvailability());
					
					String saveMsg = loginDAO.saveGroceryData(groceryEntity);
					
					return saveMsg;
				}
				
			}
			
		} catch (GroceryException|NullPointerException e) {
			logger.info(e);
		}
		
		
		return "Grocery Data Cannot Be Saved";
	}

}
