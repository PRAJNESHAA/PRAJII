package com.Instagram.demo.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.GeneratedValue;

@Entity
public class Account {
	@Id
	@GeneratedValue
	private Long accountid;
	private int accountnumber;
	private String accountstartdate;
	public Long getAccountid() {
		return accountid;
	}

	public void setAccountid(Long accountid) {
		this.accountid = accountid;
	}

	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getAccountstartdate() {
		return accountstartdate;
	}

	public void setAccountstartdate(String accountstartdate) {
		this.accountstartdate = accountstartdate;
	}

	@Override
	public String toString() {
		return "Account [accountid=" + accountid + ", accountnumber=" + accountnumber + ", accountstartdate="
				+ accountstartdate + ", user=" + user + "]";
	}
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="")
	private User user;
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
