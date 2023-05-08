package com.Workshop.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Workshop.demo.Model.LoginModel;

@Repository
public interface LoginModelRepository extends JpaRepository<LoginModel,String>{

}
