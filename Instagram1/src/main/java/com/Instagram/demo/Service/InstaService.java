package com.Instagram.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Instagram.demo.Model.Insta;
import com.Instagram.demo.Repository.InstaRepository;

@Service
public class InstaService {
	@Autowired
	public InstaRepository repobj;
	
	public Insta SaveInfo(Insta obj)
	{
		return repobj.save(obj);
	}
	public List<Insta> getAllInsta()
	{
		List<Insta> Instalist=repobj.findAll();
		return Instalist;
	}
	public Insta updateInfo(Insta ins)
	{
		return repobj.saveAndFlush(ins);
	}
	public void deleteInfo(int id)
	{
		repobj.deleteById(id);
	}

}
