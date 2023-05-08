package com.Instagram.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Instagram.demo.Model.Account;
import com.Instagram.demo.Service.AccountService;

@RestController
public class AccountController {
	@Autowired
	public AccountService aser;
	@PostMapping("/postacc")
	public Account add(@RequestBody Account accountnumber)
	{
		return aser.addAccount(accountnumber);
	}
	@GetMapping("/getacc")
	public List<Account> getAccount()
	{
		return aser.getAccount();
	}
	

}
