package com.gpg.dao;

import com.gpg.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends BaseDao<User> {

    User findByUserNameAndUserPass(String userName,String userPass);


    User findByUserName(String userName);
}
