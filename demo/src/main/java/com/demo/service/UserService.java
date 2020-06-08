package com.demo.service;

import com.demo.error.BusinessException;
import com.demo.service.model.UserModel;

public interface UserService {
    UserModel getUserById(Integer id);
    void register(UserModel userModel) throws BusinessException;
    UserModel validateLogin(String telephone, String encrptPassword) throws BusinessException;
}
