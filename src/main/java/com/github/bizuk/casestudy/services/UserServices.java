package com.github.bizuk.casestudy.services;

import com.github.bizuk.casestudy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {

    private UserRepository UserRepository;

    @Autowired
    public UserServices(UserRepository repository){
        this.UserRepository = repository;

        }
}
