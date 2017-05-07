package com.credit.service;

import com.credit.model.User;

/**
 * @date：06
 * @author:fushuai
 */
public interface IUserService {
    public User getUserById(int userId);
    public int addUser(User user);
    public User getUserByName(String name);
}
