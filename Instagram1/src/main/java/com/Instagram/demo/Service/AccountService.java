package com.Instagram.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Instagram.demo.Model.Account;
import com.Instagram.demo.Repository.AccountRepository;

@Service
public class AccountService {
	@Autowired
	public AccountRepository arep;
	public Account addAccount(Account accountnumber)
	{
		return arep.save(accountnumber);
	}
	public List<Account> getAccount()
	{
		return arep.findAll();
	}
	

}
