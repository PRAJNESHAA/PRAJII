package com.Instagram.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Instagram.demo.Model.InstaLogin;

public interface InstaLoginrep extends JpaRepository<InstaLogin,Integer> {
	InstaLogin findByusername(String username);

}
