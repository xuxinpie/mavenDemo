package com.xinux.mavenDemo.dao;

import java.util.List;

import com.xinux.mavenDemo.model.User;

public interface UserDao {

    /**
     * 插入一条用户数据
     * 
     * @param user
     */
    public int insertUser(User user);

    /**
     * 根据用户Id查找对应用户，一个用户唯一对应一个UserId
     * 
     * @param id
     * @return
     */
    public User findUserById(long id);

    /**
     * 查找全部用户
     * 
     * @return
     */
    public List<User> findAllUsers();

    /**
     * 更新用户
     * 
     * @param user
     */
    public int updateUserInfo(User user);

    /**
     * 根据用户Id删除一个用户
     * 
     * @param id
     */
    public int deleteUserById(long id);

    /**
     * 查找用户id在集合中的用户
     * 
     * @param idList
     * @return
     */
    public List<User> selectUserInList(List<Integer> idList);

}
