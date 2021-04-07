package com.wolken.wolkenapp.dao;

import com.wolken.wolkenapp.entity.PageEntity;

public interface PageDAO {

	public String savePage(PageEntity pageEntity );

	public PageEntity getByUserName(String userName);

}
