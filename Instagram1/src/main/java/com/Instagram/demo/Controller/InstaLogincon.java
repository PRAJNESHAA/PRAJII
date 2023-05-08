package com.Instagram.demo.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Instagram.demo.Model.InstaLogin;
import com.Instagram.demo.Service.InstaLoginser;

@RestController
@RequestMapping("/user")
public class InstaLogincon {

	@Autowired
	private InstaLoginser lser;
	@PostMapping("/login")
	public String login(@RequestBody Map<String,String>loginData)
	{
		String username=loginData.get("username");
		String password=loginData.get("password");
		String result=lser.checkLogin(username, password);
		return result;
	}
	@PutMapping("/put")
	public InstaLogin putUser(@RequestBody InstaLogin cl)
	{
		return lser.putUser(cl);
	}
	@PostMapping("/add")
	public InstaLogin AddUser(@RequestBody InstaLogin cl)
	{
		return lser.addUser(cl);
	}
	@GetMapping("/")
	public List<InstaLogin> listAll()
	{
		return lser.getUser();
	}
}
