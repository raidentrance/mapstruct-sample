package com.raidentrance.model.dto;

import com.raidentrance.model.pojo.Role;

/**
 * @author raidentrance
 *
 */
public class UserDto {
	private String username;
	private Role role;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
