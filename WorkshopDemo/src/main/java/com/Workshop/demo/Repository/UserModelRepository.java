package com.Workshop.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Workshop.demo.Model.UserModel;

@Repository
public interface UserModelRepository extends JpaRepository<UserModel,Integer>{

}
