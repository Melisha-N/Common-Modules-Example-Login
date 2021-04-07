package com.wolken.wolkenapp.entity;

import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Component
@Entity
@Table(name="page_details")
public class PageEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO , generator = "mel")
	@GenericGenerator(name="mel",strategy="native")
	@Column(name="page_id")
	private int PageId;
	
	@Column(name="page_username")
	private String userName;
	
	@Column(name="page_email_id")
	private String emailId;
	
	@Column(name="page_contact_no")
	private String contactNo;
	
	@Column(name="page_dob")
	private String dob;
	
	@Column(name="page_gender")
	private String gender;
	
	@Column(name="page_password")
	private String password;
	
//	@Column(name="page_confirm_password")
//	private String confirmPassword;

}
