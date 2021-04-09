package com.wolken.wolkenapp.dao;

import com.wolken.wolkenapp.dto.UpdateDTO;
import com.wolken.wolkenapp.entity.GroceryEntity;
import com.wolken.wolkenapp.entity.LoginEntity;
import com.wolken.wolkenapp.entity.PageEntity;

public interface LoginDAO {

	public LoginEntity getByUserName(String userName);

	public PageEntity getByEmailId(String emailId);

	public int updateByEmailId(UpdateDTO updateDTO);
	

	public String saveGroceryData(GroceryEntity groceryEntity);

}
