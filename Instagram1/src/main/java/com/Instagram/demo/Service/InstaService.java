package com.Instagram.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.Instagram.demo.Model.Insta;
import com.Instagram.demo.Repository.InstaRepository;

import jakarta.transaction.Transactional;

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
	public Insta getInsta(int id)
	{
		Insta i = repobj.findById(id).get();
		return i;
	}
	public List<Insta> sortInsta(String field)
	{
		return repobj.findAll(Sort.by(field));
	}
	public List<Insta> descsortInsta(String field)
	{
		return repobj.findAll(Sort.by(Direction.DESC,field));
	}
	public Page<Insta>pagingInsta(int offset,int pagesize)
	{
		Pageable paging=PageRequest.of(offset, pagesize);
		Page<Insta>InsData=repobj.findAll(paging);
		return InsData;
	}
	public List<Insta>pagingAndSorting(int offset,int pagesize,String field)
	{
		Pageable paging=PageRequest.of(offset, pagesize).withSort(Sort.by(field));
		Page<Insta>Ins=repobj.findAll(paging);
		return Ins.getContent();
	}
	public List<Insta> fetchInstaByNamePrefix(String prefix)
	{
		  return repobj.findByNameStartingWith(prefix);
	}
	public List<Insta> fetchInstaByNameSuffix(String suffix)
	{
		  return repobj.findByNameEndingWith(suffix);
	}
	public List<Insta> getInstaByEmail(String email,String name)
	{
		  return repobj.getInstaByEmail(email,name);
	}
	@Transactional
	public int deleteInstaByName(String name)
	{
		return repobj.deleteInstaByName(name);
	}
	@Transactional
	public int updateInsta(String email,String name)

	{
		return repobj.updateInsta(email, name);
	}
	@Transactional
	public List<Insta> fetchInstaByName(String name)
	{
		return repobj.fetchInstaByName(name);
	}


}
