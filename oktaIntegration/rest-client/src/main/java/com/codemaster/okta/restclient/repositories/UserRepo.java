package com.codemaster.okta.restclient.repositories;

import com.codemaster.okta.restclient.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface UserRepo extends JpaRepository<User, Long>
{
    @Query(value = "select * from user where username = :userName", nativeQuery = true)
    User getUserByName(@Param("userName") String userName);

    @Modifying
    @Transactional
    @Query(value = "truncate table user", nativeQuery = true)
    void deleteAll();
}