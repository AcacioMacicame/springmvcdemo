package org.macicame.springmvcdemo.service;

import org.macicame.springmvcdemo.model.User;

import java.util.List;

public interface UserService {
   void save(User user);

   List<User> list();
}
