package com.cisco.aopdemo.business;

import com.cisco.aopdemo.dto.User;
import com.cisco.aopdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements  UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void addUser(User user) {
        userRepository.addUser(user);
    }
}
