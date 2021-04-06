package com.wolken.wolkenapp.dao;


import org.apache.log4j.Logger;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;

import com.wolken.wolkenapp.entity.PageEntity;

@Component
public class PageDAOImpl implements PageDAO{
	
	@Autowired
	LocalSessionFactoryBean bean;
	
	Logger logger = Logger.getLogger(PageDAOImpl.class);
	
	@Override
	public String savePage(PageEntity pageEntity) {
		
		
		logger.info("Inside savePage method of PageDAOImpl");
		
		SessionFactory factory = bean.getObject();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(pageEntity);
		
		transaction.commit();
		session.close();
		
		logger.info("End of savePage method of PageDAOImpl");
		
		return "Data is saved successfully!!";
	}

	@Override
	public PageEntity getByUserName(String userName) {
		
		logger.info("Inside getByUserName method of PageDAOImpl");
		
		SessionFactory factory = bean.getObject();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query getQ = session.createQuery("from  PageEntity pg where pg.userName=: userName");
		getQ.setParameter("userName", userName);
		PageEntity pageEntity = (PageEntity) getQ.uniqueResult();
		
		transaction.commit();
		session.close();
		
		logger.info("End of getByUserName method of PageDAOImpl");
		
		return pageEntity;
	}

}
