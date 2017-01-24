package com.hansight.supersonic.service;


import com.hansight.supersonic.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
