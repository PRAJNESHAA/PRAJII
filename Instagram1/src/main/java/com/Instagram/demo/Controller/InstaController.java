package com.Instagram.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
	@DeleteMapping("/del")
	public String deleteByRequest(@RequestParam ("id") int idn)
	{
		seobj.deleteInfo(idn);
		return " Id Number "+ idn + " is deleted ";
	}
	@GetMapping("/getInsta/{id}")
	public Insta getInsta(@PathVariable("id") int id)
	{
		return seobj.getInsta(id);
	}
	@GetMapping("/sortInsta/{field}")
	public List<Insta> sortInsta(@PathVariable String field)
	{
		return seobj.sortInsta(field);
	}
	@GetMapping("/descsortInsta/{field}")
	public List<Insta> descsortInsta(@PathVariable String field)
	{
		return seobj.descsortInsta(field);
	}
	@GetMapping("/paging/{offset}/{pagesize}")
	public Page<Insta>pagingInsta(@PathVariable("offset") int offset,@PathVariable("pagesize") int pagesize)
	{
		return seobj.pagingInsta(offset,pagesize);
	}
	@GetMapping("/pagingAndSorting/{offset}/{pagesize}/{field}")
	public List<Insta>pagingAndSorting(@PathVariable("offset") int offset,@PathVariable("pagesize") int pagesize,@PathVariable("field") String field)
	{
		return seobj.pagingAndSorting(offset,pagesize,field);
	}
	@GetMapping("/fetchInstaByNamePrefix/{prefix}")
	public List<Insta>fetchInstaByNamePrefix(@PathVariable String prefix)

	{
		return seobj.fetchInstaByNamePrefix(prefix);
	}
	@GetMapping("/fetchInstaByNameSuffix/{suffix}")

	public List<Insta>fetchInstaByNameSuffix(@PathVariable String suffix)

	{
		return seobj.fetchInstaByNameSuffix(suffix);
	}
	@GetMapping("/getInstaByEmail/{email}/{name}")
	public List<Insta>fetchInstaByEmail(@PathVariable String email,@PathVariable String name)
	{
		return seobj.getInstaByEmail(email,name);
	}
	@DeleteMapping("/deletebyquery/{name}")
	public String deleteInstaByName(@PathVariable("name") String name)
	{
		int result=seobj.deleteInstaByName(name);
		if(result>0)

			return "User record deleted";
		else
			return "Problem occured while deleting";
	}
	@PutMapping("/updatebyquery/{email}/{name}")
	public String updateInsta(@PathVariable ("email")String email,@PathVariable ("name")String name)
	{
		int result= seobj.updateInsta(email,name);
		if(result>0)
			return "User record updated";
		else
			return "Problem occured while updating";
	}
	@GetMapping("/fetchbyname/{name}")
	public List<Insta> fetchInstaByName(@PathVariable String name)
	{
		return seobj.fetchInstaByName(name);
	}


}
