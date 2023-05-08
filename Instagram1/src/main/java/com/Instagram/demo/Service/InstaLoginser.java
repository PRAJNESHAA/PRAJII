package com.Instagram.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Instagram.demo.Model.InstaLogin;
import com.Instagram.demo.Repository.InstaLoginrep;

@Service
public class InstaLoginser {
	@Autowired
	private InstaLoginrep lrepo;
	public String checkLogin(String username,String password)
	{
		InstaLogin user = lrepo.findByusername(username);
		if(user==null)
		{
			return "No User Found";
		}
		else
		{
			if(user.getPassword().equals(password))
			{
				return "LoginSuccessfully";
			}
			else
			{
				return "Login Failed";
			}
		}
	}
	public InstaLogin addUser(InstaLogin cl)
	{
		return lrepo.save(cl);
	}
	public List<InstaLogin> getUser()
	{
		return lrepo.findAll();
	}
	public InstaLogin putUser(InstaLogin cl)
	{
		return lrepo.save(cl);
	}

}
