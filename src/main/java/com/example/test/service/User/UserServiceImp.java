package com.example.test.service.User;

import com.example.test.mapper.UserMapper;
import com.example.test.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements  IntUserService{

    @Autowired
    private UserMapper userMapper;
    @Override
    public User getuser(String username, String pwd) {
        System.out.println(username+"实现类"+pwd);
        return userMapper.getuser(username,pwd);
    }
}
