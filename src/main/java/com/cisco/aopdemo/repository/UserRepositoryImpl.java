package com.cisco.aopdemo.repository;

import com.cisco.aopdemo.dto.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class UserRepositoryImpl implements UserRepository {

    private List<User> users = new ArrayList<>();

    @Override
    public void addUserRepo(User user) {
        users.add(user);
    }
}
