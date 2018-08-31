package com.gpg.service.impl;

import com.gpg.dao.JdtUrlDao;
import com.gpg.dao.JurisdictionDao;
import com.gpg.dao.UserDao;
import com.gpg.dao.UserInfoDao;
import com.gpg.pojo.User;
import com.gpg.pojo.UserInfo;
import com.gpg.pojo.jdtn.Jdt;
import com.gpg.pojo.jdtn.JdtUrl;
import com.gpg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class userServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;
    @Autowired
    private UserInfoDao userInfoDao;
    @Autowired
    private JurisdictionDao jurisdictionDao;
    @Autowired
    private JdtUrlDao jdtUrlDao;

    @Override
    public User getOne(Long userId) {
        return userDao.getOne(userId);
    }

    @Override
    public User getOne(String userName) {
        return userDao.findByUserName(userName);
    }

    @Override
    public User getOne(String userName,String userPass) {
        return userDao.findByUserNameAndUserPass(userName,userPass);
    }

    @Override
    public List<Jdt> getJdtList(Long userId) {
        return null;
    }

    @Override
    public List<Jdt> getJdtList(String userName) {
        return null;
    }

    @Override
    public List<JdtUrl> getUrlList(Long userId) {
        return null;
    }

    @Override
    public List<JdtUrl> getUrlList(String userName) {
        return null;
    }

    @Override
    public UserInfo getUserInfo(Long userId) {
        return userInfoDao.getOne(userId);
    }

    @Override
    public UserInfo getUserInfo(String userName) {
        return null;
    }

}
