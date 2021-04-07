package com.wolken.wolkenapp.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolken.wolkenapp.dao.LoginDAO;
import com.wolken.wolkenapp.dto.LoginDTO;
import com.wolken.wolkenapp.entity.LoginEntity;

@Service
public class LoginServiceImpl implements LoginService{
	
	Logger logger = Logger.getLogger(LoginServiceImpl.class);
	
	@Autowired
	LoginDAO loginDAO;
	
	@Override
	public String validateAndLogin(LoginDTO loginDTO) {
		
		try {
			LoginEntity	loginEntity = new LoginEntity();
			
			logger.info("Calling loginDAO.getByUserName()");
			loginEntity = loginDAO.getByUserName(loginDTO.getUserName());
			
			logger.info("loginEntity="+loginEntity);
			
			logger.info("loginDTO.getUserName()="+loginDTO.getUserName());
			logger.info("loginEntity.getUserName()="+loginEntity.getUserName());

			logger.info("loginDTO.getPassword()="+loginDTO.getPassword());
			logger.info("loginEntity.getPassword()="+loginEntity.getPassword());
			
			
			if(loginEntity !=null) {
				
				if(loginDTO.getUserName().equals(loginEntity.getUserName())) {
					
					if(loginDTO.getPassword().equals(loginEntity.getPassword())) {
						
						logger.info("Succesfully Logged In");
						return "Succesfully Logged In";
						
					}
					else {
						logger.info("Password doesnt match with existing one");
						return "Password doesnt match with existing one";
					}
					
				}
				else {
					logger.info("Username doesnt match with existing one");
					return "Username doesnt match with existing one";
				}
			}
			
		} catch (Exception e) {
			logger.info("Inside Catch Block of LoginServiceImpl");
			
		}
		logger.info("Login - Unsuccessful");
		return "Login - Unsuccessful";
	}

}
