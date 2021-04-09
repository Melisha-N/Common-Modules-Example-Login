package com.wolken.wolkenapp.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolken.wolkenapp.custom.ContactException;
import com.wolken.wolkenapp.custom.DataException;
import com.wolken.wolkenapp.custom.UserNameException;
import com.wolken.wolkenapp.dao.PageDAO;
import com.wolken.wolkenapp.dto.PageDTO;
import com.wolken.wolkenapp.entity.PageEntity;

//@Component
@Service
public class PageServiceImpl implements PageService {
	
	Logger logger = Logger.getLogger(PageServiceImpl.class);
	PageEntity pageEntity = new PageEntity();
	
	@Autowired
	PageDAO pageDAO;

	@Override
	public String validateAndSave(PageDTO pageDTO) {

		try {
			if(pageDTO !=null) {
				if(pageDTO.getUserName().length() <3 || pageDTO.getUserName().length() >18 ) {
					logger.info("UserNameException-executing");
					throw new UserNameException();
				}
				if(pageDTO.getContactNo().length() < 1 || pageDTO.getContactNo().length() >11) {
					logger.info("ContactException-executing");
					throw new ContactException();
				}
				else {
					  PageEntity pageE = pageDAO.getByUserName(pageDTO.getUserName());
					  if(pageE !=null) {
						  
						  logger.info("User Name Already Exists!!!");
						  return "User Name already Exists!!";
					  }
					  else {
						  
						  pageEntity.setUserName(pageDTO.getUserName());
						  
						  pageEntity.setEmailId(pageDTO.getEmailId());
						  
						  pageEntity.setContactNo(pageDTO.getContactNo());
						  
						  pageEntity.setDob(pageDTO.getDob());
						  
						  pageEntity.setGender(pageDTO.getGender());
						  
						  pageEntity.setPassword(pageDTO.getPassword());
						  
						  
						  String addMsg = pageDAO.savePage(pageEntity);
						 
						 return addMsg;
					  }
				}
				
			}else {
				
				logger.info("DataException-executing");
				throw new DataException();

			}
			
		} catch (DataException | UserNameException| ContactException | NullPointerException e) {
			logger.info("Inside Catch block of validateAndSave");
			logger.info(e);
		}
		return "Data cannoted be saved";
	}

}
