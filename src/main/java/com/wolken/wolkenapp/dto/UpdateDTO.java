package com.wolken.wolkenapp.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class UpdateDTO {

private String emailId;
private String userName;
private String contactNo;
private String dob;

}
