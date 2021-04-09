package com.wolken.wolkenapp.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolken.wolkenapp.dao.LoginDAO;
import com.wolken.wolkenapp.dto.UpdateDTO;
import com.wolken.wolkenapp.entity.PageEntity;

@Service
public class GetAndUpdateByEmailIdServiceTmpl implements GetAndUpdateByEmailIdService{

	@Autowired
	LoginDAO loginDAO;
	
	Logger logger =Logger.getLogger(GetAndUpdateByEmailIdServiceTmpl.class);
	
	@Override
	public PageEntity validateAndGetEmailId(String emailId) {
		try {
			logger.info(emailId);
			PageEntity pageEntity = loginDAO.getByEmailId(emailId);
			return pageEntity;
		} catch (Exception e) {
			
		}
		
		return null;
	}

	@Override
	public String validateAndUpdate(UpdateDTO updateDTO) {
		try {
			int result = loginDAO.updateByEmailId(updateDTO);
			if(result >= 1 ) {
				return "Data Updated Succesfully";
			}else {
				return "Update-Unsuccesful";
			}
			
		} catch (Exception e) {
		}
    	return " Data updation not possible";
	}

}
