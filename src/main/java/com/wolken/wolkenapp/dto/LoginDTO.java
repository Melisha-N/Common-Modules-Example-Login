package com.wolken.wolkenapp.dto;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

//@Getter @Setter @ToString @EqualsAndHashCode
@Data
@NoArgsConstructor

@Component
public class LoginDTO {
	
	private String userName;
	private String password;

}
