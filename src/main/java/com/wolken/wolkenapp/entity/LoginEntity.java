package com.wolken.wolkenapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@NoArgsConstructor

@Component
@Entity
@Table(name="page_details")
public class LoginEntity {
	
	@Id
	@Column(name="page_id")
	private int PageId;
	
	@Column(name="page_username")
	private String userName;
	
	@Column(name="page_password")
	private String password;
}
