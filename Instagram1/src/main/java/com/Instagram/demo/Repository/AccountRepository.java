package com.Instagram.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Instagram.demo.Model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long>{
	@Query(value="select a from Account a join a.user u")
	List<Account>getAccount();

}
