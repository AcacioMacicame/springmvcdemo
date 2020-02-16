package org.macicame.springmvcdemo.dao;

import org.macicame.springmvcdemo.model.User;

import java.util.List;

public interface UserDao {
   void save(User user);
   List<User> list();
}
