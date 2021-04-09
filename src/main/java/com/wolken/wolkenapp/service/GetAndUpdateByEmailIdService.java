package com.wolken.wolkenapp.service;

import com.wolken.wolkenapp.dto.UpdateDTO;
import com.wolken.wolkenapp.entity.PageEntity;

public interface GetAndUpdateByEmailIdService {

	public PageEntity validateAndGetEmailId(String emailId);

	public String validateAndUpdate(UpdateDTO updateDTO);

}
