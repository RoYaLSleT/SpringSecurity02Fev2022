package com.wcs.springsecurity.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserAuthDto {
	@NotBlank
	@Size(min = 4, max = 50)
	private String username;
	
	@NotBlank
	@Size(min = 8, max = 20)
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
