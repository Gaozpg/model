package com.gpg.service;

import com.gpg.pojo.User;
import com.gpg.pojo.UserInfo;
import com.gpg.pojo.jdtn.Jdt;
import com.gpg.pojo.jdtn.JdtUrl;

import java.util.List;

public interface UserService {

    /**
     * 获取单个用户
     * @param userId
     * @return
     */
    public User getOne(Long userId);

    public User getOne(String userName);

    /**
     * 验证用户名密码时使用
     * @param userName
     * @return
     */
    public User getOne(String userName,String userPass);

    /**
     * 获取用户权限
     * @param userId
     * @return
     */
    public List<Jdt> getJdtList(Long userId);

    public List<Jdt> getJdtList(String userName);

    /**
     * 获取所有用户可访问的限制地址
     * @param userId
     * @return
     */
    public List<JdtUrl> getUrlList(Long userId);

    public List<JdtUrl> getUrlList(String userName);

    /**
     * 获取用户信息
     * @param userId
     * @return
     */
    public UserInfo getUserInfo(Long userId);

    public UserInfo getUserInfo(String userName);

}
