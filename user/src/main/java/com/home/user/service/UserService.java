package com.home.user.service;

import com.home.user.model.UserModel;
import com.home.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserModel saveUser(UserModel user) {
        log.info("Inside saveUser of UserService");
        return userRepository.save(user);
    }

    public UserModel getUserWithId(Long userId) {
       return userRepository.findByUserId(userId);
    }

}
