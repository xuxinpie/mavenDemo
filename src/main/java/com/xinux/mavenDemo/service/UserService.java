package com.xinux.mavenDemo.service;

import java.util.List;

import com.xinux.mavenDemo.model.User;

public interface UserService {

    /**
     * 根据用户id查找用户
     * 
     * @param id
     * @return User
     */
    public User getUserById(long id);

    /**
     * 列出所有用户
     * 
     * @return
     */
    public List<User> getAllUsers();

    /**
     * 插入用户
     * 
     * @param id
     * @return
     */
    public boolean insertUserById(long id);

    /**
     *根据用户Id删除用户 
     * 
     * @param id
     * @return
     */
    public boolean deleteUserByI(long id);

    /**
     * 更新用户信息
     * 
     * @param user
     * @return
     */
    public boolean updateUser(User user);

}
