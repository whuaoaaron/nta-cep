package com.hansight.supersonic.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}
