package com.wolken.wolkenapp.dto;

import org.hibernate.type.ShortType;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor

@Component
public class GroceryDTO {

	private String groceryName;
	private String groceryType;
	private double groceryPrice;;
	private String groceryQuantity;
	private String groceryAvailability;
	

}
