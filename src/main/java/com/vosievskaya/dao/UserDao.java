package com.vosievskaya.dao;

import com.vosievskaya.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {

}
