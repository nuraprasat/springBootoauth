package com.sample.service;

import java.util.List;

import com.sample.model.User;

public interface AppService {
	User save(User user);
    List<User> findAll();
    void delete(long id);
}
