//package com.wolken.wolkenapp.service;
//
//import org.apache.log4j.Logger;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import com.wolken.wolkenapp.custom.ContactException;
//import com.wolken.wolkenapp.custom.DataException;
//import com.wolken.wolkenapp.custom.UserNameException;
//import com.wolken.wolkenapp.custom.UserNameExistsException;
//import com.wolken.wolkenapp.dao.PageDAO;
//import com.wolken.wolkenapp.dto.PageDTO;
//import com.wolken.wolkenapp.entity.PageEntity;
//
//@Component
//public class PagesssServiceImpl implements PageService {
//
//	@Autowired
//	PageDAO pageDAO;
//
//	Logger logger = Logger.getLogger(PagesssServiceImpl.class);
//
//	@Override
//	public String validateAndSave(PageDTO pageDTO) {
//		try {
//			if(pageDTO !=null) {
//				logger.info("Page DTO is not null");
//				
//				if(pageDTO.getUserName() !=null && pageDTO.getUserName().length() > 3 && pageDTO.getUserName().length() <18) {
//					logger.info("Page Username  is not null");
//					
//					if(pageDTO.getContactNo().length() > 0 && pageDTO.getContactNo().length() <11) {
//						logger.info("Valid Contact no.");
//						PageEntity pageEntity=new PageEntity();
//						PageEntity	pageEntity1 = pageDAO.getByUserName(pageDTO.getUserName());
//						logger.info(pageEntity1.getUserName());
//						 
//						if(pageEntity1 != null) {
//							logger.info("UserNameExistsException");
//							throw new UserNameExistsException();
//						}
//						
//						else {
//							
//							 logger.info(pageDTO.getUserName());
//								pageEntity.setUserName(pageDTO.getUserName());
//								logger.info("username set");
//								pageEntity.setEmailId(pageDTO.getEmailId());
//								logger.info("email set");
//								pageEntity.setContactNo(pageDTO.getContactNo());
//								logger.info("contact set");
//								pageEntity.setDob(pageDTO.getDob());
//								logger.info("dob set");
//								pageEntity.setGender(pageDTO.getGender());
//								logger.info("gender set");
//								pageEntity.setPassword(pageDTO.getPassword());
//								logger.info("pwd set\n saving to db");
//								String savemsg = pageDAO.savePage(pageEntity);
//								logger.info("Page Entity is saved");
//								return savemsg;
//						}
//					
//						
//					}
//			
//					else {
//						logger.info("ContactException");
//						throw new ContactException();
//					}
//				
//				else {
//					logger.info("UserNameException");
//					throw new UserNameException();
//				}
//			
//		else {
//				
//		}
//			
//		}catch(UserNameExistsException|DataException|UserNameException|ContactException|NullPointerException e)
//	{
//		logger.info(e);
//		return"Data cannot be saved";
//	}
//}
//		}
//}
