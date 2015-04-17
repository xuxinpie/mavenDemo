package com.xinux.mavenDemo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xinux.mavenDemo.dao.UserDao;
import com.xinux.mavenDemo.model.User;
import com.xinux.mavenDemo.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(long id) {
        User user = userDao.findUserById(id);
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.findAllUsers();
    }

    @Override
    public boolean insertUserById(long id) {
        return false;
    }

    @Override
    public boolean deleteUserByI(long id) {
        return false;
    }

    @Override
    public boolean updateUser(User user) {
        return false;
    }

}
