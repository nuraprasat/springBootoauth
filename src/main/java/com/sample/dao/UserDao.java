package com.sample.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sample.model.User;

@Repository
public interface UserDao extends CrudRepository<User, Long> {
    public User findByUsername(String username);
}
