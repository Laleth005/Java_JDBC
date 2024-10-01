package com.lalethbook;

public class Login {
private String password="admin";
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean valid(String name,String pass,String role)
	{
		
		if(pass.equalsIgnoreCase(password)) {
			return true;
		}
		else
		{
			return false;
		}
	}
}
