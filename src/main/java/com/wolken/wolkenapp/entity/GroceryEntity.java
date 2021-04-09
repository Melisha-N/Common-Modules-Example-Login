package com.wolken.wolkenapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.type.ShortType;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@NoArgsConstructor

@Component
@Entity
@Table(name="grocery_details")
public class GroceryEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator = "mel")
	@GenericGenerator(name = "mel", strategy="native")
	@Column(name="grocery_id")
	private int groceryId;
	
	@Column(name="grocery_name")
	private String groceryName;
	
	@Column(name="grocery_type")
	private String groceryType;

	@Column(name="grocery_price")
	private double groceryPrice;;
	
	@Column(name="grocery_quantity")
	private String groceryQuantity;
	
	@Column(name="grocery_availability")
	private String groceryAvailability;


}
