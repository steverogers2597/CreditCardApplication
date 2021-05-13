package com.cg.CreditCard.model;

public class UserDTO {
	
	private String userId;
	private String password;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserDTO(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", password=" + password + "]";
	}
	

	
}
