package com.Workshop.demo.Model;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="AdminModel")
public class AdminModel {

	@Id
	@Column(name="Email")
	private String email;
	@Override
	public String toString() {
		return "AdminModel [email=" + email + ", password=" + password + ", mobilenumber=" + mobilenumber + ", userrole="
				+ userrole + "]";
	}
	public AdminModel()
	{
		super();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getUserrole() {
		return userrole;
	}
	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}
	@Column(name="Password")
	private String password;
	@Column(name="MobileNumber")
	private String mobilenumber;
	@Column(name="UserRole")
	private String userrole;
	
}
