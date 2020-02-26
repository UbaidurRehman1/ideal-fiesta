package com.codemaster.okta.authusersservice.repo;

import javax.transaction.Transactional;

import com.codemaster.okta.authusersservice.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long>
{
    @Query(value = "select * from user where username = :userName", nativeQuery = true)
    public User getUserByName(@Param("userName") String userName);

    @Modifying
    @Transactional
    @Query(value = "delete from user", nativeQuery = true)
    public void deleteAll();
}