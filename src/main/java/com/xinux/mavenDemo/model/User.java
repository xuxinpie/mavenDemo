package com.xinux.mavenDemo.model;

/**
 * 用户Model
 * 
 * @author hanlin.xx
 * @version $Id: User.java, v 0.1 2015-4-9 下午2:21:10 hanlin.xx Exp $
 */
public class User {

    public long   id;

    public String email;

    public String userName;

    public String password;

    public int    age;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return ("User: " + userName + " ID: " + id + " Email: " + email + " Password: " + password
                + " Age: " + age);
    }

}
