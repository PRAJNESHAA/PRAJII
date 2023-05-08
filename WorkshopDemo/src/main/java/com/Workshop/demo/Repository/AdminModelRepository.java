package com.Workshop.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Workshop.demo.Model.AdminModel;

@Repository
public interface AdminModelRepository extends JpaRepository<AdminModel,String>{

}
