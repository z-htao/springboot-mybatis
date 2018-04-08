package com.sgc.service;


import com.github.pagehelper.Page;
import com.sgc.model.User;

public interface UserService {

    int addUser(User user);

    Page<User> findAllUser(int pageNum, int pageSize);

}
