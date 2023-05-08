package com.Instagram.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import com.Instagram.demo.Model.Insta;

@Repository
@RestController
public interface InstaRepository extends JpaRepository<Insta,Integer> {
	@Query("select s from Insta s where s.email=?1 and s.name=?2")

	public List<Insta>getInstaByEmail(String email,String name);

	@Query("select s from Insta s where s.email=:email")

	public List<Insta>getInstaByEmail(String email);

	@Modifying

	@Query("delete from Insta s where s.name=?1")

    public int deleteInstaByName(String name);

    @Modifying

    @Query("update Insta s set s.email=?1 where s.name=?2 ")

    int updateInsta(String email,String name);



    @Query(value="select*from Insta s where s.name=?1",nativeQuery=true)

	public List<Insta>fetchInstaByName(String name);

	

	List<Insta> findByNameStartingWith(String prefix);

    List<Insta> findByNameEndingWith(String suffix);

    List<Insta> findByName(String name);

}
