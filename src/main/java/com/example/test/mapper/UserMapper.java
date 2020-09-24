package com.example.test.mapper;

import com.example.test.model.User;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.tags.Param;

public interface UserMapper {
    User getuser(@org.apache.ibatis.annotations.Param("name") String name, @org.apache.ibatis.annotations.Param("pwd") String pwd);
}
