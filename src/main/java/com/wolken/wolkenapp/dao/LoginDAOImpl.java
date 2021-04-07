package com.wolken.wolkenapp.dao;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;

import com.wolken.wolkenapp.entity.LoginEntity;

@Component
public class LoginDAOImpl implements LoginDAO{
	
	@Autowired
	LocalSessionFactoryBean bean;
	
	@Override
	public LoginEntity getByUserName(String userName) {
		
			Logger logger = Logger.getLogger(LoginDAOImpl.class);
			
			logger.info("Inside getByUserName method of LoginDAOImpl");
			
			SessionFactory factory = bean.getObject();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			
			Query getQ = session.createQuery("from  LoginEntity le where le.userName=: userName");
			getQ.setParameter("userName", userName);
			LoginEntity loginEntity = (LoginEntity) getQ.uniqueResult();
			
			transaction.commit();
			session.close();
			
			logger.info("End of getByUserName method of LoginDAOImpl");
			
			return loginEntity;
		
	}

}
