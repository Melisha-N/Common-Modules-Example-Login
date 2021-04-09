package com.wolken.wolkenapp.dao;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;

import com.wolken.wolkenapp.dto.UpdateDTO;
import com.wolken.wolkenapp.entity.GroceryEntity;
import com.wolken.wolkenapp.entity.LoginEntity;
import com.wolken.wolkenapp.entity.PageEntity;

@Component
public class LoginDAOImpl implements LoginDAO{
	
	@Autowired
	LocalSessionFactoryBean bean;
	
	Logger logger = Logger.getLogger(LoginDAOImpl.class);
	
	@Override
	public LoginEntity getByUserName(String userName) {
		
			logger.info("Inside getByUserName method of LoginDAOImpl\n");
			
			SessionFactory factory = bean.getObject();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			
			Query getQ = session.createQuery("from  LoginEntity le where le.userName=: userName\n");
			getQ.setParameter("userName", userName);
			LoginEntity loginEntity = (LoginEntity) getQ.uniqueResult();
			
			transaction.commit();
			session.close();
			
			logger.info("End of getByUserName method of LoginDAOImpl\n");
			
			return loginEntity;
		
	}

	@Override
	public PageEntity getByEmailId(String emailId) {
		
		logger.info("Inside getByEmailId method of LoginDAOImpl");
		
		SessionFactory factory = bean.getObject();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		logger.info("Executing Query- from  LoginEntity le where le.emailId= :emailId");
		Query getQ = session.createQuery("select le from PageEntity le where le.emailId= :emailId");
		
		logger.info("Exceuting---setParameter(\"emailId\", emailId)\n");
		getQ.setParameter("emailId", emailId);
		
		PageEntity pageEntity = (PageEntity) getQ.uniqueResult();
		logger.info(pageEntity);
		
		transaction.commit();
		session.close();

		logger.info("End of getByEmailId method of LoginDAOImpl\n");
		return pageEntity;
	}

	@Override
	public int updateByEmailId(UpdateDTO updateDTO) {
		logger.info("Inside updateByEmailId method of LoginDAOImpl");
		SessionFactory factory = bean.getObject();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query upQ = session.createQuery("update PageEntity pe set pe.userName= :userName, pe.contactNo= :contactNo ,pe.dob= :dob where pe.emailId= :emailId");
		
		upQ.setParameter("userName",updateDTO.getUserName());
		upQ.setParameter("contactNo",updateDTO.getContactNo());
		upQ.setParameter("dob",updateDTO.getDob());
		upQ.setParameter("emailId", updateDTO.getEmailId());
		
		int result = upQ.executeUpdate();
		
		transaction.commit();
		session.close();

		logger.info("End of updateByEmailId method of LoginDAOImpl\n");
		
		return result;

	}

	@Override
	public String saveGroceryData(GroceryEntity groceryEntity) {
		logger.info("Inside saveGroceryData method of LoginDAOImpl");
		
		SessionFactory factory = bean.getObject();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(groceryEntity);
		
		transaction.commit();
		session.close();
		
		logger.info("End of  saveGroceryData method of LoginDAOImpl");
		
		return "Grocery Data Saved Successfully!!";
	}

}
