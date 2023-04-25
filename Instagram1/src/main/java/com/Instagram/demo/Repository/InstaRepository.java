package com.Instagram.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Instagram.demo.Model.Insta;

@Repository
public interface InstaRepository extends JpaRepository<Insta,Integer> {

}
