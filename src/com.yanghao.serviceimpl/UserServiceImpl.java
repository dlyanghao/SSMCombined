package com.yanghao.serviceimpl;

import com.yanghao.mapper.UserMapper;
import com.yanghao.pojo.User;
import com.yanghao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> getUserList(){
        List<User> users = userMapper.selectByExample(null);
        return users;
    }
}
