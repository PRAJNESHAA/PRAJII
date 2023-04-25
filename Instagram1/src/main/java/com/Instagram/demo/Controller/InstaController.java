package com.Instagram.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Instagram.demo.Model.Insta;
import com.Instagram.demo.Service.InstaService;

@RestController
public class InstaController {
	@Autowired
	private InstaService seobj;
	@PostMapping("/post")
	public Insta addDetails(@RequestBody Insta obj)
	{
		return seobj.SaveInfo(obj);
	}
	@GetMapping(value="/get")
	public List<Insta> getAllInsta()
	{
		List<Insta>Instalist=seobj.getAllInsta();
		return Instalist;
	}
	@PutMapping("/put")
	public Insta updateDetails(@RequestBody Insta idno)
	{
		return seobj.updateInfo(idno);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteDetails(@PathVariable ("id") int idn)
	{
		seobj.deleteInfo(idn);
		return " Id Number "+ idn + " is deleted ";
	}
	

}
